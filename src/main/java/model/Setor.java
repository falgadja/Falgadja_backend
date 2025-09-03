package model;

public class Setor {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        //verificar se o nome do setor passado contém conteúdo
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do setor não pode ser vazio.");
        }        
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Setor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Setor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
