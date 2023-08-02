package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args){

        // // a estrutura com chaves só funciona 
        // // na declaracao da variavel
        // double vetor[] = {10,20,30};
        // System.out.println("vetor: " + vetor );
        // // System.out.println(Arrays.toString(vetor));

        // System.out.println("vetor: " + Arrays.toString(vetor));

        // System.out.println("valor da posicao 0: " + vetor[0]);
        
        // int vetor3[] = new int[4];
        // System.out.println(Arrays.toString(vetor3));
        // vetor3[0] = 100;
        // vetor3[1] = 200;
        // vetor3[2] = 300;
        // vetor3[3] = 400;
        // System.out.println(Arrays.toString(vetor3));


        // double matriz[][] = {{1,2,3},{4,5,6}};
        // System.out.println(Arrays.toString(matriz[0]));
        // System.out.println(Arrays.toString(matriz[1]));

        // // nao deve-se colocar o valor entre colchetes quando
        // // coloca-se os valores entre chaves
        // // a outra opcao e colocar valor entre colchetes e nao 
        // // colocar nada nas chaves
        // matriz[0] = new double[]{10,20,30};
        // System.out.println(Arrays.toString(matriz[0]));

        // // tambem e possivel ter linhas de tamanhos diferentes numa matriz
        // matriz[1] = new double[2];

        // System.out.println("Nova matriz");
        // System.out.println(Arrays.toString(matriz[0]));
        // System.out.println(Arrays.toString(matriz[1]));

        int vetor3[] = new int[5];
        for(int i = 0; i < vetor3.length; i++){
            vetor3[i] = 100*(i+1);
        }

        System.out.println(Arrays.toString(vetor3));
        System.out.println();

        double matriz[][] = new double[3][4];

        // System.out.println(matriz[1].length);
        for (int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = 10*(j+1) + 10*matriz[i].length*(i);
                // System.out.print(matriz[i][j] + " ");
                System.out.printf("%5.1f ", matriz[i][j]);
            }
        }

        for (int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = 10*(j+1) + 10*matriz[i].length*(i);
                // System.out.print(matriz[i][j] + " ");
                System.out.printf("%6.1f", matriz[i][j]);
            }
        }
        // System.out.println("Linha 0: " + Arrays.toString(matriz[0])); 
        // System.out.println("Linha 1: " + Arrays.toString(matriz[1])); 
        String product = "Bread";
        double price = 4.99;
        
        System.out.println();
        String str = String.format("The price of %2$s is CAD $%1$.2f today.", price, product);
        
        // The price of Bread is CAD $4.99 today.
        System.out.println(str);

        // Troquei a ordem dos parametros product e price e deu erro.
        // System.out.println();
        // String str2 = String.format("The price of %2$s is CAD $%1$.2f today.", product, price);
        
        // // The price of Bread is CAD $4.99 today.
        // System.out.println(str2);
    }
}
