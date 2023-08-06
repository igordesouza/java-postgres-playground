package com.example;

class Cliente {
    private String nome;
    private String cpf;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;
    private double aleatorio;
    private String cidade;

    // Construtor sem parâmetros
    public Cliente() {

        System.out.println();
        System.out.println("Criando um novo cliente usando o construtor sem parâmetros");
        System.out.println();

        // double aleatorio = Math.random();
        aleatorio = Math.random();
        // System.out.println("Aleatorio:" + aleatorio);
        if (aleatorio > 0.5)
            especial = true;
        else
            especial = false;
    }

    // Construtor com parâmetros
    public Cliente(double renda, char sexo) {

        this();

        System.out.println();
        System.out.println("Criando um novo cliente usando o construtor com parâmetros");
        System.out.println();

        setRenda(renda);
        this.sexo = sexo;

        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank())
            System.out.println("O nome não pode ser vazio");
        else this.nome = nome.toUpperCase().trim();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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

    public boolean isEspecial() {
        return especial;
    }

    public double getAleatorio() {
        return aleatorio;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}