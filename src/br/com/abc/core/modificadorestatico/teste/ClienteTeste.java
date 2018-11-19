package br.com.abc.core.modificadorestatico.teste;

import br.com.abc.core.modificadorestatico.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        System.out.println("Exibindo a quantidade de parcela");
        System.out.println(Cliente.getParcelas().length);
    }
}
