package model;

import java.time.LocalDateTime;

public class Turno {
    private int qtd_funcionarios;
    private int id;
    private LocalDateTime tempo_duracao;

    public Turno(int qtd_funcionarios, int id, LocalDateTime tempo_duracao) {
        //verificar se a quantidade está certa
        if (qtd_funcionarios<0) {
            throw new IllegalArgumentException("A quantidade mínima é 1.");
        }
        this.qtd_funcionarios = qtd_funcionarios;
        this.id = id;
        //verificar se a data já foi
        if (tempo_duracao.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("A data informada já passou");
        }
        this.tempo_duracao=tempo_duracao;
    }
    

    public int getQtd_funcionarios() {
        return qtd_funcionarios;
    }

    public int getId() {
        return id;
    }
    
    public LocalDateTime getTempo_duracao() {
        return tempo_duracao;
    }
    public void setQtd_funcionarios(int qtd_funcionarios) {
        //verificar se a quantidade está certa
        if (qtd_funcionarios<0) {
            throw new IllegalArgumentException("A quantidade mínima é 1.");
        }
        this.qtd_funcionarios = qtd_funcionarios;
    }

    public void setData(LocalDateTime tempo_duracao) {
        //verificar se a data já foi
        if (tempo_duracao.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("A data informada já passou");
        }
        this.tempo_duracao = tempo_duracao;
    }

    public String toString() {
        return "Turno{" +
                "qtd_funcionarios=" + qtd_funcionarios +
                ", id=" + id +
                '}';
    }
}
