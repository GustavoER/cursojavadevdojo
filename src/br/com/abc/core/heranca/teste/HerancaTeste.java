package br.com.abc.core.heranca.teste;

import br.com.abc.core.heranca.classes.Endereco;
import br.com.abc.core.heranca.classes.Funcionario;
import br.com.abc.core.heranca.classes.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Gina");
        p.setCpf("123456");
        Endereco endereco = new Endereco();
        endereco.setBairro("Bairro 1");
        endereco.setRua("Rua 25");
        p.setEndereco(endereco);
        p.imprime();

        Funcionario f = new Funcionario();
        f.setNome("Augusto");
        f.setCpf("98765");
        f.setSalario(15000);
        f.setEndereco(endereco);
    }
}
