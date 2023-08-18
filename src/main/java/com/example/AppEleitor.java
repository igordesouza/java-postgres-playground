package com.example;

import java.time.LocalDate;

public class AppEleitor {
    public static void main(String[] args){

        var cidadao = new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(1990,8,11));
        
        System.out.println("A idade do cidadão é " + cidadao.idade());
        System.out.println(cidadao.eleitor());
    }
}
