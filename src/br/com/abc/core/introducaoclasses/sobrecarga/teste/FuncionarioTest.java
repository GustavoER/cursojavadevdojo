package br.com.abc.core.introducaoclasses.sobrecarga.teste;

import br.com.abc.core.introducaoclasses.sobrecarga.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva","111.222.333-44",4500d,"4454545");
        funcionario.imprime();
    }
}
