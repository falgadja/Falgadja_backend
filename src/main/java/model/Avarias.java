package model;

public class Avarias {
    private int id;
    private String nome;
    private String descricao;

    public int getId() {
        return id;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        //verificar se o valor passado contém conteúdo
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("O nome da avaria não pode ser vazio.");
        }
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //verificar se o valor passado contém conteúdo
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome da avaria não pode ser vazio.");
        }
        this.nome = nome;
    }

    public Avarias(int id, String nome, String descricao) {
        this.id = id;
        //verificar se o valor passado contém conteúdo
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome da avaria não pode ser vazio.");
        }
        this.nome = nome;
        //verificar se o valor passado contém conteúdo
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("O nome da avaria não pode ser vazio.");
        }
        this.descricao = descricao;
    }

    public String toString() {
        return "Avarias{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}