package modelo;

public class Cliente {

    private int id;
    private String nome;
    private String telefone;
    private int totalEmprestimos;

    public Cliente() {
    }

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Cliente(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTotalEmprestimos() {
        return totalEmprestimos;
    }

    public void setTotalEmprestimos(int totalEmprestimos) {
        this.totalEmprestimos = totalEmprestimos;
    }

    @Override
    public String toString() {
        return "id: " + id + ", nome: " + nome;
    }

}
