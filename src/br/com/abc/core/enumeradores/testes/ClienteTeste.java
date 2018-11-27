package br.com.abc.core.enumeradores.testes;

import br.com.abc.core.enumeradores.classes.Cliente;
import br.com.abc.core.enumeradores.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);
        System.out.println(c);
    }
}
