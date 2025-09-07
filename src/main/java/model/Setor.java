package model;

public class Setor {
    private int id;
    private int qtdFuncionarios;
    private String tempoDuracao;
    // CONSTRUTOR
    public Setor(int id, int qtdFuncionarios, String tempoDuracao) {
        this.id = id;
        this.qtdFuncionarios = qtdFuncionarios;
        this.tempoDuracao = tempoDuracao;
    }

    // GETTERS
    public int getId() {
        return id;
    }
    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }
    public String getTempoDuracao() {
        return tempoDuracao;
    }
    // SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }
    public void setTempoDuracao(String tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
    // TO STRING
    @Override
    public String toString() {
        return "Setor: " +
                "id: " + id +
                ", qtdFuncionarios: " + qtdFuncionarios +
                ", tempoDuracao: '" + tempoDuracao + '\'' ;
    }
}
