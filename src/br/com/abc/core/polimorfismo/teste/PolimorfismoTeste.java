package br.com.abc.core.polimorfismo.teste;

import br.com.abc.core.polimorfismo.classes.Gerente;
import br.com.abc.core.polimorfismo.classes.RelatorioPagamento;
import br.com.abc.core.polimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Osvaldo",5000,2000);
        Vendedor v = new Vendedor("Yuri",2000,20000);
        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
        //relatorioPagamento.relatorioPagamentoGerente(g);
        relatorioPagamento.relatorioPagamentoGenerico(g);
        relatorioPagamento.relatorioPagamentoGenerico(v);
        System.out.println("-------------------------------");

    }
}
