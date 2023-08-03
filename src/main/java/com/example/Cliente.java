package com.example;

class Cliente {
    private double renda;
    private char sexo;
    private int anoNascimento;

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if(renda > 0)
            this.renda = renda;
        else
            System.out.println("A renda deve ser maior que zero");
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
        else System.out.println("O sexo deve ser M ou F");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        if (anoNascimento > 1900)
            this.anoNascimento = anoNascimento;
        else System.out.println("O ano de nascimento deve ser maior que 1900");
    }

}