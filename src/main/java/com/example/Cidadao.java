package com.example;

import java.time.LocalDate;

public class Cidadao {
    private LocalDate dataNascimento;
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int idade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    public String eleitor() {
        int idade = idade();

        if (idade < 16)
            return "não é eleitor";
        
        if ((idade >= 16 && idade < 18) || (idade > 70))
            return "é eleitor facultativo"; 
        
        return "é eleitor obrigatório";
        
    }
}
