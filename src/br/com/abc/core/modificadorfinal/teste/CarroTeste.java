package br.com.abc.core.modificadorfinal.teste;

import br.com.abc.core.modificadorfinal.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());
    }
}
