package br.com.abc.core.metodos.teste;

import br.com.abc.core.metodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.multiplicaDoisNumeros(5,5);
        double result =calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4);
    }
}
