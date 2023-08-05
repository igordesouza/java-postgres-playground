package com.example;

public class AppClasses {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Criando cliente 1");
        Cliente cliente = new Cliente();
        cliente.setRenda(-10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1990);

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

        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Especial: " + cliente2.isEspecial());
        System.out.println("Aleatório: " + cliente2.getAleatorio());


    }
}
