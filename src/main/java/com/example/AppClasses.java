package com.example;

public class AppClasses {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Criando cliente 1");
        Cliente cliente = new Cliente();

        cliente.setNome("         Manoel       ");
        cliente.setCpf("999999999999");
        cliente.setRenda(-10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1990);
        cliente.setCidade("Fortaleza");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Especial: " + cliente.isEspecial());
        System.out.println("Aleatório: " + cliente.getAleatorio());


        System.out.println();

        System.out.println("Criando cliente 2");
        Cliente cliente2 = new Cliente(20000, 'F');
        // cliente2.setRenda(10000);
        // cliente2.setSexo('F');
        cliente2.setAnoNascimento(1890);
        cliente2.setNome("Raysa Melo");
        cliente2.setCpf(new String("999999999999"));
        cliente2.setCidade("FORTALEZA");


        // No Java, ao comparar strings, você não deve usar o operador ==, 
        // pois ele compara as referências de objeto em vez do conteúdo real das strings. 
        // Em vez disso, você deve usar o método equals() para comparar o conteúdo das strings.
        // if (cliente.getCpf() == cliente2.getCpf())
        //     System.out.println("Os cpfs são iguais");
        // else System.out.println("Os cpfs são diferentes");

        if (cliente.getCpf().equals(cliente2.getCpf())) {
            System.out.println("Os CPFs são iguais");
        } else {
            System.out.println("Os CPFs são diferentes");
        }

        if (cliente.getCidade().equalsIgnoreCase(cliente2.getCidade()))
            System.out.println("Mesma cidade");
        else System.out.println("Cidades diferentes");
        
        var vetorNome = cliente2.getNome().split(" ");
        //String[] vetorNome = cliente2.getNome().split(" ");


        System.out.println();
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Primeiro Nome: " + vetorNome[0]);
        System.out.println("Sobrenome: " + vetorNome[1]);
        System.out.println("Primeiro caractere: " + cliente2.getNome().charAt(0));
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Especial: " + cliente2.isEspecial());
        System.out.println("Aleatório: " + cliente2.getAleatorio());

        
    }
}
