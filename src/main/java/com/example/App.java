package com.example;

public class App {

    public static void main(String[] args){
        System.out.println("");
        System.out.println("");
        System.out.println("Hello World!\n");

        // cast. conversão de tipo. pode estourar.
        // sem cast o código não roda.
        // error: Type mismatch: cannot convert from int to byte
        int idadeInt = 129;
        byte idade = (byte)idadeInt; 
        double peso = 70;

        System.out.println("Idade é " + idade + " e peso é " + peso);
    }
}