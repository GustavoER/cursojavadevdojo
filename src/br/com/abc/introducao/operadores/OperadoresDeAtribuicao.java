package br.com.abc.introducao.operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        salario = salario + (int) (salario * 0.1);
        System.out.println(salario);

    }
}
