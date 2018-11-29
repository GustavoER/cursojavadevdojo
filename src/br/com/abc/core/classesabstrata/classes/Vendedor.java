package br.com.abc.core.classesabstrata.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, String cpf, double salario, double totalVendas) {
        super(nome, cpf, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario += totalVendas * 0.05;
    }
}
