package br.com.abc.core.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "aaabaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressão: "+matcher.pattern());
        System.out.println("posiçeõs encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }
    }
}
