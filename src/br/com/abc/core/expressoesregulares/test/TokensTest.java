package br.com.abc.core.expressoesregulares.test;

public class TokensTest {
    public static void main(String[] args) {
        String str = "William, Paulo, Joana, Camila, Anna, John, Matheus";
        String[] tokens = str.split(",");
        for (String token : tokens) {
            System.out.println(token.trim());
        }
    }
}
