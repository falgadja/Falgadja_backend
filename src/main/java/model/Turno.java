package model;

import java.time.LocalDateTime;

public class Turno {
    private int qtd_funcionarios;
    private int id;
    private LocalDateTime tempo_duracao;

    // CONSTRUTOR

    public Turno(int qtd_funcionarios, LocalDateTime tempo_duracao, int id) {
        this.qtd_funcionarios = qtd_funcionarios;
        this.tempo_duracao = tempo_duracao;
        this.id = id;
    }

    // GETTERS

    public int getQtd_funcionarios() {
        return qtd_funcionarios;
    }

    public LocalDateTime getTempo_duracao() {
        return tempo_duracao;
    }

    public int getId() {
        return id;
    }

    // SETTERS

    public void setQtd_funcionarios(int qtd_funcionarios) {
        this.qtd_funcionarios = qtd_funcionarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTempo_duracao(LocalDateTime tempo_duracao) {
        this.tempo_duracao = tempo_duracao;
    }

    // TO STRING

    public String toString() {
        return "Turno{" +
                "qtd_funcionarios=" + qtd_funcionarios +
                ", id=" + id +
                ", tempo_duracao=" + tempo_duracao +
                '}';
    }
}
