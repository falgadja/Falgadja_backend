package model;

public class Empresa {
    //ATRIBUTOS
    private long cpnj;
    private String nomeEmpresa;
    private Login login;
    private int qtd_funcionarios;
    private Funcionario funcionario;

   //CONSTRUTORES
    public Empresa(long cpnj, String nomeEmpresa, int qtd_funcionarios) {
        this.cpnj = cpnj;
        this.nomeEmpresa = nomeEmpresa;
        this.qtd_funcionarios = qtd_funcionarios;

    }
    public Empresa(String nomeEmpresa, Funcionario funcionario) {
        this.nomeEmpresa = nomeEmpresa;
        this.funcionario = funcionario;
    }
    //MÉTODO GET
    public long getCpnj() {
        return cpnj;
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public Login getLogin() {
        return login;
    }
    public int getQtd_funcionarios() {
        return qtd_funcionarios;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    //MÉTODOS SET
    public void setCpnj(long cpnj) {
        this.cpnj = cpnj;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    public void setLogin(Login login) {
        this.login = login;
    }
    public void setQtd_funcionarios(int qtd_funcionarios) {
        this.qtd_funcionarios = qtd_funcionarios;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    //MÉTODO TO STRING
    public String toString() {
        return "Nome da empresa: "+ nomeEmpresa+"\n Cnpj: "+cpnj+"\nLogin: "+login+"\nFuncionario: "+funcionario;
    }
}
