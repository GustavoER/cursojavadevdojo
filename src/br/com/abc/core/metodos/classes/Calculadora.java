package br.com.abc.core.metodos.classes;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(5+5);
    }
    public void subtraiDoisNumeros(){
        System.out.println(5-5);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros(double num1, double num2) throws Exception {
        if(num2 == 0){
            throw new Exception("O segundo valor não pode ser 0");
        }
        return num1/num2;
    }
    public void alteraDoisNumeros(Integer num1, Integer num2){
        num1 = 30;
        num2 = 40;
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
    // Apenas 1 var args por assinatura de metodo
    // no caso de mais de um parametro passar o var args por ultimo
    public void somaVarArgs(double valor, int... numeros){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }
}
