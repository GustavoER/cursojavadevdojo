package br.com.abc.core.introducaoclasses.classes.test;

import br.com.abc.core.introducaoclasses.metodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Integer num1=5;
        Integer num2=10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);

    }
}
