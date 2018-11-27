package br.com.abc.core.modificadorfinal.classes;

public class Carro {
    // caso seja static final inicializar no inicializador
    //private static final double VELOCIDADE_FINAL;
    // caso seja final inicializar no construtor ou diretamente;
    private final Comprador comprador = new Comprador();
    private final double VELOCIDADE_FINAL = 250;
    private String nome;
    private String marca;

    static {
        // VELOCIDADE_FINAL = 200;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Comprador getComprador() {
        return comprador;
    }

    public double getVelocidadeFinal() {
        return this.VELOCIDADE_FINAL;
    }

    /*
    Não precisa de set pois é final
    publics void setVelocidadeFinal(double velocidadeFinal) {
        Carro.VELOCIDADE_FINAL = velocidadeFinal;
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
