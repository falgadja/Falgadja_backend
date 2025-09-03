package dao;

import model.Funcionario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//Essa classe serve para conversar com o banco de dados e executar os comandos

public class FuncionarioDAO {
    //Conexão com o banco
    private Connection connection;

    public FuncionarioDAO(Connection connection) {
        this.connection = connection;
    }
    // CREATE
    public void inserir(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario (nome, data_nascimento, id_setor, id_turno) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = connection.prepareStatement(sql)) { //PreparedStatament executa instruçoes e permite parametros//
            pst.setString(1, funcionario.getNome());        //substitui o ? com o nome
            pst.setDate(2, funcionario.getDataNascimento());
            pst.setInt(3, funcionario.getIdSetor());
            pst.setInt(4, funcionario.getIdTurno());
            pst.executeUpdate();    //roda o comando
        }
    }

    // READ - buscar por codigo
    public Funcionario buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM funcionario WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {
                return new Funcionario(
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getDate("data_nascimento").toLocalDate(),
                        resultado.getInt("id_setor"),
                        resultado.getInt("id_turno")
                );
            }
        }
        return null;
    }

    // READ - listar todos
    public List<Funcionario> listarTodos() throws SQLException {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            //Percorrer as linhas e adicionar na lista para mostrar
            while (rs.next()) {
                funcionarios.add(new Funcionario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDate("data_nascimento").toLocalDate(),
                        rs.getInt("id_setor"),
                        rs.getInt("id_turno")
                ));
            }
        }
        return funcionarios;
    }

    // UPDATE - Atualiza
    public void atualizar(Funcionario funcionario) throws SQLException {
        //Comando sql
        String sql = "UPDATE funcionario SET nome=?, data_nascimento=?, id_setor=?, id_turno=? WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setDate(2, funcionario.getDataNascimento());
            stmt.setInt(3, funcionario.getIdSetor())    ;
            stmt.setInt(4, funcionario.getIdTurno());
            stmt.setInt(5, funcionario.getId());
            stmt.executeUpdate();
        }
    }

    // DELETE- Apaga
    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM funcionario WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
