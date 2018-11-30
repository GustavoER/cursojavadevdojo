package br.com.abc.core.exception.customException.test;

import br.com.abc.core.exception.customException.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) throws LoginInvalidoException {
        logar();
    }

    public static void logar() throws LoginInvalidoException {
        String usuario = "Goku";
        String senha = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        if(!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }
    }
}
