package com.example;

public class AppHelloWorld {

    public static void main(String[] args){
        System.out.println("");
        System.out.println("");
        System.out.println("Hello World!\n");

        // cast. conversão de tipo. pode estourar.
        // sem cast o código não roda.
        // error: Type mismatch: cannot convert from int to byte
        // int idadeInt = 129;
        // byte idade = (byte)idadeInt; 
        // double peso = 70;
        byte idade = 42;
        double peso = 85;

        System.out.println("Idade é " + idade + " e peso é " + peso);

        char sexo = 'M';

        System.out.println("Sexo: " + sexo);

        // o tipo pode ser var, mas um valor pode ser definido
        boolean necessidadesEspeciais = true;
        System.out.println("Tem necessidades especiais:" + necessidadesEspeciais);

    }
}