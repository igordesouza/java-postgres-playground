package com.example;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBd {
    public static void main(String[] args) {
        try {
            // Carrega a classe do driver JDBC para PostgreSQL
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // Trata o caso em que a classe do driver não pôde ser encontrada
            System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados: " + e.getMessage());
        } 

        Statement statement = null;
        try (var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "")) {
            System.out.println("Conexão com o banco realizada com sucesso!");

            // Cria um objeto Statement para executar consultas SQL
            statement = conn.createStatement();
            
            // Executa uma consulta SQL e obtém o resultado
            var result = statement.executeQuery("select * from estado");
            
            // Itera sobre os resultados e exibe as informações
            while (result.next()) {
                System.out.printf("Id: %d Nome: %s UF: %s \n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (SQLException e) {
            // Trata os erros relacionados à conexão ou execução de consultas
            if (statement == null)
                System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
            else
                System.err.println("Não foi possível executar a consulta ao banco de dados: " + e.getMessage());
        }
    }
}

