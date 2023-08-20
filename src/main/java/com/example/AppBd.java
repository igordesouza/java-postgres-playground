package com.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBd {
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
    private Connection conn;

    public static void main(String[] args) {
        new AppBd();
    }

    public AppBd() {
        try (var conn = getConnection()) {
            // carregarDriverJDBC(); não é necessário
            listarEstados(conn);
            localizarEstado(conn, "CE");
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }
    private void localizarEstado(Connection conn, String uf) {
        try {
            // var sql = "select * from estado where uf = '" + uf + "'"; // suscetível a sql injection
            var sql = "select * from estado where uf = ?"; 
            var statement = conn.prepareStatement(sql);
            statement.setString(1, uf);
            System.out.println(sql);
            var result = statement.executeQuery();
            if (result.next()) {
                System.out.printf("Id: %d Nome: %s UF: %s \n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao executar consulta SQL: " + e.getMessage());
        }

    }

    private void listarEstados(Connection conn) {
        try {
            System.out.println("Conexão com o banco realizada com sucesso!");

            // Cria um objeto Statement para executar consultas SQL
            var statement = conn.createStatement();
            
            // Executa uma consulta SQL e obtém o resultado
            var result = statement.executeQuery("select * from estado");
            
            // Itera sobre os resultados e exibe as informações
            while (result.next()) {
                System.out.printf("Id: %d Nome: %s UF: %s \n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }

            System.out.println();
        } catch (SQLException e) {
            System.err.println("Não foi possível executar a consulta ao banco: " + e.getMessage());
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

//    private void carregarDriverJDBC() {
//      try {
            // Carrega a classe do driver JDBC para PostgreSQL
//            Class.forName("org.postgresql.Driver");
 //       } catch (ClassNotFoundException e) {
            // Trata o caso em que a classe do driver não pôde ser encontrada
//            System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados: " + e.getMessage());
//        }
//    }
}


