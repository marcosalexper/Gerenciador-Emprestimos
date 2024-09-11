package dao;

import modelo.Cliente;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class ClienteDAO {

    public static ArrayList<Cliente> minhalista = new ArrayList<>();

    public ArrayList getMinhaLista() {

        minhalista.clear();

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_clientes");
            while (res.next()) {

                int id = res.getInt("id");
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");

                Cliente objeto = new Cliente(id, nome, telefone);

                minhalista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return minhalista;
    }

    public boolean insertClienteBD(Cliente objeto) {
        String sql = "INSERT INTO tb_clientes(id,nome,telefone) VALUES(?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTelefone());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public boolean deleteClienteBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_clientes WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    public boolean updateClienteBD(Cliente objeto) {

        String sql = "UPDATE tb_clientes set nome = ? ,telefone = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Cliente carregaCliente(int id) {

        Cliente objeto = new Cliente();
        objeto.setId(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_clientes WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setTelefone(res.getString("telefone"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }

    public Cliente getClienteComMaisEmprestimos() {
        Cliente clienteComMaisEmprestimos = null;
        int maxEmprestimos = 0;

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT id_cliente, COUNT(*) as total_emprestimos FROM tb_emprestimos GROUP BY id_cliente ORDER BY total_emprestimos DESC LIMIT 1");

            if (res.next()) {
                int idCliente = res.getInt("id_cliente");
                int totalEmprestimos = res.getInt("total_emprestimos");

                clienteComMaisEmprestimos = carregaCliente(idCliente);
                maxEmprestimos = totalEmprestimos;
            }

            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                this.getConexao().close();
            } catch (Exception e) {
            }
        }

        if (clienteComMaisEmprestimos != null) {
            clienteComMaisEmprestimos.setTotalEmprestimos(maxEmprestimos);
        }

        return clienteComMaisEmprestimos;
    }

    private Connection getConexao() {
        return Conexao.getConexao();
    }
}
