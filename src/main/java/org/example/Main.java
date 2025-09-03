package org.example;

import dao.EmpresaDAO;
import model.Empresa;
import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        //EMPRESA
        Empresa empresa = new Empresa(123456789,"Seara",25);
        System.out.println("****************** OBJETO EMPRESA ***********************");
        System.out.println(empresa);
        // EMPRESA DAO
        EmpresaDAO dao = new EmpresaDAO();

        //FUNCIONARIOS
        Funcionario funcionario=new Funcionario(1,"Sergio",);
    }
}