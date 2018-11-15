package br.com.abc.core.introducaoclasses.metodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;

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
