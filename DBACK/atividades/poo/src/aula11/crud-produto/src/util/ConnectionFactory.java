package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String URL = "jdbc:mysql://localhost:3306/aulajdbc";
    private static final String USERNAME = "root";
    private static final String PASS = "aluno";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";


    public static Connection getConnection(){
        try {
            //tenta reconhecer driver
            Class.forName(DRIVER);
            System.out.println("Conectando ao banco de dados...");
            return DriverManager.getConnection(URL, USERNAME, PASS);
            //caso falte o driver
        } catch (ClassNotFoundException e) {
            System.out.println("Driver jdbc não encontrado!");
            throw new RuntimeException("Erro Driver Jdbc ausente "  + e);
            //ou falte alguma injeção SQL
        }catch (SQLException e){
            System.out.println("Erro ao conectar ao banco de dados!");
            //stacktrace Ficha corrida do erro para tentar entender o erro
            e.printStackTrace();
            throw new RuntimeException("Erro ao obter a conexão com BD!" + e);

        }
    }

}
