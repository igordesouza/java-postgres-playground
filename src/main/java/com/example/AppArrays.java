package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args){

        // a estrutura com chaves só funciona 
        // na declaracao da variavel
        double vetor[] = {10,20,30};
        System.out.println("vetor: " + vetor );
        // System.out.println(Arrays.toString(vetor));

        System.out.println("vetor: " + Arrays.toString(vetor));

        System.out.println("valor da posicao 0: " + vetor[0]);
        
        int vetor3[] = new int[4];
        System.out.println(Arrays.toString(vetor3));
        vetor3[0] = 100;
        vetor3[1] = 200;
        vetor3[2] = 300;
        vetor3[3] = 400;
        System.out.println(Arrays.toString(vetor3));


        double matriz[][] = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));

        // nao deve-se colocar o valor entre colchetes quando
        // coloca-se os valores entre chaves
        // a outra opcao e colocar valor entre colchetes e nao 
        // colocar nada nas chaves
        matriz[0] = new double[]{10,20,30};
        System.out.println(Arrays.toString(matriz[0]));

        // tambem e possivel ter linhas de tamanhos diferentes numa matriz
        matriz[1] = new double[2];

        System.out.println("Nova matriz");
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));

    }
}
