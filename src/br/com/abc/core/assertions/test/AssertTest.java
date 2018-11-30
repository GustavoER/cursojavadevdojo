package br.com.abc.core.assertions.test;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-2000);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0) : "Salário deve ser maior que 0";
    }

    public static void calcSalario(double salario) {
        if (salario > 0) {

        } else {
            System.out.println("Se chegou aqui ferrou");
        }
    }
}
