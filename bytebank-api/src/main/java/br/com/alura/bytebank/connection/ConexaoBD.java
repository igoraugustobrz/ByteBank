package br.com.alura.bytebank.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    public static void main(String[] args) {

        try {
            // Estabele a conexão com o BD
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=admin");

        } catch (SQLException e) {
            System.out.println(e);

        }
    }
}
