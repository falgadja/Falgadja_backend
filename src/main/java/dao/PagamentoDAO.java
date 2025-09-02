package dao;

import model.Pagamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagamentoDAO {
    //Classe conexão
    private Connection con;

    //
    public PagamentoDAO(Connection con) {
        this.con=con;

    }
    //CREATE-- Inserir tipo de pagamento, valor e total
    public void inserir(Pagamento pagamento) throws SQLException {
        String sql= "INSERT INTO pagamento (tipo, total) VALUES ( ?, ?)";
        try{
            PreparedStatement pst = con.prepareStatement(sql);//PreparedStatament executa instruçoes e permite parametros//
            pst.setString(2,pagamento.getTipo());
            pst.setDouble(3,pagamento.getTotal());
        }catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    //CREATE
}
