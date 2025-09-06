package testes;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    Dotenv dotenv = Dotenv.load();
    String serverName = dotenv.get("serverName");
    String port = dotenv.get("port");
    String databaseName = dotenv.get("databaseName");
    String usuario = dotenv.get("usuario");
    String senha = dotenv.get("senha");
    public Connection conectar(){
        Connection conn;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://"+serverName+":"+port+"/"+databaseName, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
    public void desconectar(Connection conn){
        try {
            if(conn!= null && conn.isClosed()){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
