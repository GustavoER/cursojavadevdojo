package br.com.abc.core.interfaces.testes;

import br.com.abc.core.interfaces.classes.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 3000);
        p.calculaFrete();
        p.calcularImposto();
        System.out.println(p);

    }
}
