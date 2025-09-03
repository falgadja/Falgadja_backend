package model;

public class Turno {
    private int qtd_funcionarios;
    private int id;
    private LocalDateTime;

    public Turno(int qtd_funcionarios, int id) {
        this.qtd_funcionarios = qtd_funcionarios;
        this.id = id;
    }

    public int getQtd_funcionarios() {
        return qtd_funcionarios;
    }

    public void setQtd_funcionarios(int qtd_funcionarios) {
        this.qtd_funcionarios = qtd_funcionarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Turno{" +
                "qtd_funcionarios=" + qtd_funcionarios +
                ", id=" + id +
                '}';
    }
}
