package br.com.abc.core.heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void imprime(){
        super.imprime();
        System.out.println("Salário "+ this.getSalario());
        imprimeReciboPagamento();
    }
    public void imprimeReciboPagamento(){
        System.out.println("Eu "+super.nome+" recebi "+this.salario);
    }
}
