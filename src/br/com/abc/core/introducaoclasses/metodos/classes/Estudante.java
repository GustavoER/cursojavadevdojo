package br.com.abc.core.introducaoclasses.metodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;

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

    public void imprimirDados(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        double soma=0;
        for (double nota : notas) {
            soma += nota;
        }
        System.out.println(soma/3 >= 6? "Aprovado": "Reprovado");
    }
}
