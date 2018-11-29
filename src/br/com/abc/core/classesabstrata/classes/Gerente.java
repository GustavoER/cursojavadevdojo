package br.com.abc.core.classesabstrata.classes;

public class Gerente extends Funcionario {
    public Gerente() {
        super();

    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario += salario * 0.2;
    }

}
