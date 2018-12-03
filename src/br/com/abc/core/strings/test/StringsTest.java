package br.com.abc.core.strings.test;

public class StringsTest {
    public static void main(String[] args) {
        String nome = "William";
        nome.concat(" Concat");
        String teste = "Goku";
        String teste2 = "0123456789";
        String teste3 = "      Gustavo         ";
        System.out.println(teste.charAt(0));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace('o','a'));
        System.out.println(teste2.substring(0,5));
        System.out.println(teste3.length());
        System.out.println(teste3.trim().length());
    }
}
