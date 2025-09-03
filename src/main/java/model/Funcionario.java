package model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Funcionario {
    private int id;
    private String nome;
    private LocalDate dataNascimento;
    private int idSetor;
    private int idTurno;

    // Construtores
    public Funcionario(int id, String nome, LocalDate dataNascimento, int idSetor, int idTurno) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idSetor = idSetor;
        this.idTurno = idTurno;
    }

    // Getters e Setters
    public int getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getDataNascimento() {
        this.dataNascimento = dataNascimento;
        return dataNascimento;
    }
    public void setIdade(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public int getIdSetor() { return idSetor; }
    public void setIdSetor(int idSetor) { this.idSetor = idSetor; }

    public int getIdTurno() { return idTurno; }
    public void setIdTurno(int idTurno) { this.idTurno = idTurno; }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ",Nome: '" + nome + '\'' +
                ", Data de nascimento: " + dataNascimento +
                ", idSetor:" + idSetor +
                ", idTurno:" + idTurno +
                '}';
    }

    //Método para verificar data de nascimento
    public boolean verificaDataNascimento(LocalDateTime dataNascimento) {
        LocalDateTime agora = LocalDateTime.now(); //Instanciar data de agr
        System.out.println(agora);
        if (agora.isBefore(dataNascimento)) {
            return false;
        } else if (agora.isEqual(dataNascimento)) {
            return false;
        } else {
            return true;
        }
    }
}
