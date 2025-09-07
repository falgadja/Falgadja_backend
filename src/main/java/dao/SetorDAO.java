package dao;

import model.Setor;

import java.sql.SQLException;

public class SetorDAO {

    Conexao conexao = new Conexao();

    // Busca um setor pelo ID
    public Setor buscarPorID(int id) {
        try {
            conexao.conectar();

            conexao.pstmt = conexao.conn.prepareStatement("SELECT * FROM SETOR WHERE ID = ?");
            conexao.pstmt.setInt(1, id);

            conexao.rs = conexao.pstmt.executeQuery();

            if (conexao.rs.next()) {
                return new Setor(
                        conexao.rs.getInt("id"),
                        conexao.rs.getString("nome")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar(conexao.conn);
        }

        return null;
    }

    // Insere um novo setor
    public boolean inserirSetor(Setor setor) {
        try {
            conexao.conectar();

            conexao.pstmt = conexao.conn.prepareStatement("INSERT INTO TURNO (id, nome) VALUES (?, ?)");

            conexao.pstmt.setInt(1, setor.getId());
            conexao.pstmt.setString(2, setor.getNome());

            return conexao.pstmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.desconectar(conexao.conn);
        }

        return false;
    }

    // remove um setor
    public boolean removerSetor (int id) {
        try{
            conexao.conectar();

            conexao.pstmt = conexao.conn.prepareStatement("DELETE FROM SETOR WHERE ID = ?");

            conexao.pstmt.setInt(1, id);
            return conexao.pstmt.executeUpdate()>0;
        } catch (SQLException sqle){
            sqle.printStackTrace();
        } finally {
            conexao.desconectar(conexao.conn);
        }
        return false;
    }
}
