package model;

public class Empresa {
    //Atributos
    private long cpnj;
    private String nomeEmpresa;
    private Login login;
    private int qtd_funcionarios;
    private Funcionario funcionario;

   //Método Construtor
    public Empresa(long cpnj, String nomeEmpresa, int qtd_funcionarios) {
        this.cpnj = cpnj;
        this.nomeEmpresa = nomeEmpresa;
        this.qtd_funcionarios = qtd_funcionarios;

    }
    public Empresa(String nomeEmpresa, Funcionario funcionario) {
        this.nomeEmpresa = nomeEmpresa;
        this.funcionario = funcionario;
    }
    //Método get
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
    //Métodos set
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
    //Método to String
    public String toString() {
        return "Nome da empresa: "+ nomeEmpresa+"\n Cnpj: "+cpnj+"\nLogin: "+login+"\nFuncionario: "+funcionario;
    }
}
