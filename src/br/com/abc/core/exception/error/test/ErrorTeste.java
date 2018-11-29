package br.com.abc.core.exception.error.test;

public class ErrorTeste {
    public static void main(String[] args) {
        stackOverFlowError();
    }
    public static void stackOverFlowError(){
        stackOverFlowError();
    }
}
