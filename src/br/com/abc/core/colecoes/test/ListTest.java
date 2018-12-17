package br.com.abc.core.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("William");
        nomes.add("Dev Dojo");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        nomes.add("Java");
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
