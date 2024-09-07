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
        private Connection getConexao() {
        return Conexao.getConexao();
        }
}    

