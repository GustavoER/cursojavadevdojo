package br.com.abc.core.exception.checkedexception.classes;

import br.com.abc.core.exception.customException.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() {
        String a = null;
        try {
            if (a == null) {
                throw new FileNotFoundException("");
            }else{
                throw new LoginInvalidoException();
            }
        } catch (FileNotFoundException | LoginInvalidoException e) {

        }
    }
}
