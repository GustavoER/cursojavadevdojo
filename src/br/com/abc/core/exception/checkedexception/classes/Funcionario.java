package br.com.abc.core.exception.checkedexception.classes;

import br.com.abc.core.exception.customException.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    @Override
    public void salvar(){
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();
        f.salvar();
        p.salvar();
    }
}
