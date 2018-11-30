package br.com.abc.core.exception.customException;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Usúario e senha inválido");
    }

}
