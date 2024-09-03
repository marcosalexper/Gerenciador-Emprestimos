package modelo;

import java.sql.Date;

public class Emprestimo {

    private int id;
    private Cliente idCliente;
    private Ferramenta idFerramenta;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo() {

    }

    public Emprestimo(Cliente idCliente, Ferramenta idFerramenta, Date dataEmprestimo, Date dataDevolucao) {
        this.idCliente = idCliente;
        this.idFerramenta = idFerramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Emprestimo(int id, Cliente idCliente, Ferramenta idFerramenta, Date dataEmprestimo, Date dataDevolucao) {
        this.id = id;
        this.idCliente = idCliente;
        this.idFerramenta = idFerramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Ferramenta getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(Ferramenta idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}
