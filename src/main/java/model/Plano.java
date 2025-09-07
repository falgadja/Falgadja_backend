package model;

public class Plano {
    //ATRIBUTOS
    private int id;
    private String nomePlano;
    private double valor;
    private String descricao;

    //CONSTRUTOR
    public Plano(int id, String nomePlano, double valor, String descricao) {
        this.id = id;
        this.nomePlano = nomePlano;
        this.valor = valor;
        this.descricao = descricao;
    }

    //MÉTODOS GET
    public int getId() {
        return id;
    }
    public String getNomePlano() {
        return nomePlano;
    }
    public double getValor() {
        return valor;
    }
    public String getDescricao() {
        return descricao;
    }

    //MÉTODOS SET
    public void setId(int id) {
        this.id = id;
    }
    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //MÉTODO TO STRING
    @Override
    public String toString() {
        return "Plano{" +
                "id=" + id +
                ", nomePlano='" + nomePlano + '\'' +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
