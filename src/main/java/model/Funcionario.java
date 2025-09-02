package model;

public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private int idSetor;
    private int idTurno;

    // Construtores
    public Funcionario() {}

    public Funcionario(int id, String nome, int idade, int idSetor, int idTurno) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.idSetor = idSetor;
        this.idTurno = idTurno;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public int getIdSetor() { return idSetor; }
    public void setIdSetor(int idSetor) { this.idSetor = idSetor; }

    public int getIdTurno() { return idTurno; }
    public void setIdTurno(int idTurno) { this.idTurno = idTurno; }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", idSetor=" + idSetor +
                ", idTurno=" + idTurno +
                '}';
    }
}
