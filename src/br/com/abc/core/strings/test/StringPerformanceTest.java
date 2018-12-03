package br.com.abc.core.strings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto "+(fim-inicio)+" ms");
        inicio = System.currentTimeMillis();
        concatStringBuilder(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com String Builder " +(fim-inicio) + " ms");
        inicio = System.currentTimeMillis();
        concatStringBuffer(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com String Buffer " +(fim-inicio) + " ms");

    }
    public static void concatString(int tam){
        String string = "";
        for (int i = 0; i < tam; i++) {
            string += 1;
        }
    }
    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }
    }
    private static void concatStringBuffer(int tam){
        StringBuffer sb = new StringBuffer(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }
    }
}
