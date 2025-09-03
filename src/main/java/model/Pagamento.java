package model;

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

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", total=" + total +
                ", data=" + data +
                '}';
    }
}
