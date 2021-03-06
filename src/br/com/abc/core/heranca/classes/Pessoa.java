package br.com.abc.core.heranca.classes;

public class Pessoa {
    // protected pode ser acessado por herança ou estando no msm pacote
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public void imprime(){
        System.out.println("Nome " + this.nome);
        System.out.println("CPF " + this.cpf);
        System.out.println("Endereco "+ this.endereco.getRua());
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
