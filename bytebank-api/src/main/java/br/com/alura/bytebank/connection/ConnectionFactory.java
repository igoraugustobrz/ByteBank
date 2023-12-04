package br.com.alura.bytebank.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// Classe que estabelece uma conexão do BD (pode ser instanciada e utilizada em qualquer lugar)
public class ConnectionFactory {

    public Connection recuperarConexao() {
        try {
            // Estabele a conexão com o BD
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=admin");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
