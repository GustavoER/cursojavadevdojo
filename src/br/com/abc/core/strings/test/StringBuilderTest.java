package br.com.abc.core.strings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(10);
        sb.append("Palmeiras ");
        sb.append("Campeão ");
        sb.append("Brasileiro ");
        System.out.println(sb);

    }
}
