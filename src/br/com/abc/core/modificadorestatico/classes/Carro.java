package br.com.abc.core.modificadorestatico.classes;

public class Carro {
    // Velocidade limite não pode passar de 240
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;


    public void imprime(){
        System.out.println(this.nome);
        System.out.println("Velocidade máxima " +this.velocidadeMaxima);
        System.out.println("Velocidade Limite " +this.velocidadeLimite);
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
