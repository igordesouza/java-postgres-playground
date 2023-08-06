package com.example;

import java.util.Scanner;

public class AppScanner {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Criando cliente 1");
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        cliente.setNome(scanner.nextLine());

        System.out.println("Digite o CPF: ");
        cliente.setCpf(scanner.nextLine());

        System.out.println("Digite a Cidade: ");
        cliente.setCidade(scanner.nextLine());

        System.out.println("Digite a renda: ");
        cliente.setRenda(scanner.nextDouble());
        
        // Consumir a linha em branco  (retornada após a leitura do número) 
        // está sendo interpretada como uma linha vazia pelo método nextLine()
        scanner.nextLine(); 

        System.out.println("Digite o sexo (M/F): ");
        String sexoInput = scanner.nextLine().toUpperCase();
        cliente.setSexo(sexoInput.charAt(0));

        System.out.println("Digite o ano de nascimento: ");
        cliente.setAnoNascimento(scanner.nextInt());


        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Cidade: " + cliente.getCidade());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Especial: " + cliente.isEspecial());
        System.out.println("Aleatório: " + cliente.getAleatorio());

        
    }
}
