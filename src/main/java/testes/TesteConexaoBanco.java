package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexaoBanco {

    public static void main(String[] args) {
        // PEGAR VARIÁVEIS DO .ENV OU DO AMBIENTE
        String host = System.getenv("DB_HOST");
        String port = System.getenv("DB_PORT");
        String database = System.getenv("DB_NAME");
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");

        // Mostrar para conferência
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
        System.out.println("Database: " + database);
        System.out.println("User: " + user);
        System.out.println("Password: " + password);

        // Tentar conexão
        Connection con = conectar(host, port, database, user, password);

        if (con != null) {
            System.out.println("Conexão realizada com sucesso!");
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Falha na conexão. Verifique usuário, senha, host e porta.");
        }
    }

    public static Connection conectar(String host, String port, String database, String user, String password) {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver PostgreSQL não encontrado. Adicione o JAR ao classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar no banco:");
            System.out.println("Mensagem: " + e.getMessage());
        }
        return con;
    }
}
