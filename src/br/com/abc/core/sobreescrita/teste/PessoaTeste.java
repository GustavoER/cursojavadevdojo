package br.com.abc.core.sobreescrita.teste;

import br.com.abc.core.sobreescrita.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina da esquina");
        p.setIdade(300);
        System.out.println(p);
    }
}
