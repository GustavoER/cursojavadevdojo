package br.com.abc.core.modificadorestatico.teste;

import br.com.abc.core.modificadorestatico.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Audi",275);
        Carro c3 = new Carro("Mercedes",290);
        c1.imprime();
        c2.imprime();
        c3.imprime();

        c1.setVelocidadeMaxima(220);

    }
}
