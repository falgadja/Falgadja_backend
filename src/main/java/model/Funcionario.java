package model;

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

    //MÉTODOS GET
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    } 
    public int getIdSetor() {
        return idSetor;
    }
    public int getIdTurno() {
        return idTurno;
    }
    //MÉTODOS SET
    public void setId(int id) {
        this.id = id;
    }  
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }
    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }
    //Método to String

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
        LocalDateTime agora = LocalDateTime.now(); //Instanciar data de agora
        System.out.println(agora);
        if (agora.isBefore(dataNascimento)) { //Verifica se a data de agora é antes da data de nascimento
            return false;
        } else if (agora.isEqual(dataNascimento)) { //Verifica se a data de agora é igual a data de nascimento
            return false;
        } else {
            return true;
        }
    }
}
