package br.com.abc.core.metodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    // getter e setter
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public boolean isAprovado(){
        return this.aprovado;
    }

    public void imprimirDados(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        double soma=0;
        for (double nota : notas) {
            soma += nota;
        }
        this.aprovado = soma/3 >= 6? true: false;
        System.out.println(aprovado == true? "Aprovado": "Reprovado");

    }
}
