package com.example;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(2001);

        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(1901);

        var ano1 = cliente1.getAnoNascimento();
        var ano2 = cliente2.getAnoNascimento();


        if (cliente1.getAnoNascimento() == cliente2.getAnoNascimento()) {
            System.out.println("Os clientes nasceram no mesmo ano");
        } else {
            System.out.println("Os clientes não nasceram no mesmo ano");
        }

        boolean cliente1MaisVelho = ano2 > ano1;
        boolean cliente1MaisNovo = ano2 < ano1;

        if (cliente1MaisVelho) {
            System.out.println("O cliente 2, nascido em " + ano2 + ", é mais jovem que o cliente 1, nascido em " + ano1);
        } else if (cliente1MaisNovo) {
            System.out.println("O cliente 2, nascido em " + ano2 + ", é mais velho que o cliente 1, nascido em " + ano1);
        } else {
            System.out.println("O cliente 2, nascido em " + ano2 + ", tem a mesma idade que o cliente 1, nascido em " + ano1);
        }
    }
}