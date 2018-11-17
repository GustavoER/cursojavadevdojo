package br.com.abc.core.introducaoclasses.sobrecarga.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public Funcionario(){
        System.out.println("Dentro do construtor");
    }

    public Funcionario(String nome, String cpf, double salario, String rg){
        this.nome = nome;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getRg(){
        return this.rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    public void imprime(){
        System.out.println(this.getNome());
        System.out.println(this.getCpf());
        System.out.println(this.getSalario());
        System.out.println(this.getRg());
    }
}
