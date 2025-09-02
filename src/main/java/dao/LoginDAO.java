package dao;

import model.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

    //Classe serve para conectar com banco de dados
    private Connection connection;
    public LoginDAO(Connection connection) {
        this.connection = connection;
    }
    //CREATE
    public void inserir(Login login)throws SQLException {
        String sql = "INSERT INTO LOGIN VALUES(?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, login.getEmail());
            ps.setString(2, login.getPassword());
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //READ-LER OS LOGIN
    public void lerUsuario(Login login)throws SQLException {
        String sql = "SELECT * FROM LOGIN WHERE email=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, login.getEmail());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                login.setEmail(rs.getString("email"));
            }else {
                System.out.println("Email nao encontrado");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //UPDATE- atualizar/alterar o email/senha
    public void alterar(Login login)throws SQLException {
        String sql = "UPDATE LOGIN SET email=?, password=? WHERE email=?"; //atualize email
    }

    //EXCLUIR
    public void excluir(Login login)throws SQLException {
        String sql = "DELETE FROM LOGIN WHERE email=?"; //Deletar o login do usuario quando for encontrado o email
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, login.getEmail());
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

}