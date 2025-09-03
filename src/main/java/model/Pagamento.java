package model;

import java.time.LocalDate;

public class Pagamento {
    private int id;
    private String tipo;
    private double total;
    private LocalDate data;

    public Pagamento(LocalDate data, double total, String tipo, int id) {
        this.data = data;
        this.total = total;
        this.tipo = tipo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        //verificar se o valor passado contém conteúdo
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("O tipo de pagamento não pode ser vazio.");
        }
        this.tipo = tipo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        //verificar se o valor é maior que 0 e existe
        if (total<0 ) {
            throw new IllegalArgumentException("O pagamento não pode ser menor ou igual a 0.00.");
        }
        this.total = total;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        //verificar se a data já foi
        if (data.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("A data informada esta vencida");
        }
        this.data = data;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", total=" + total +
                ", data=" + data +
                '}';
    }
}
