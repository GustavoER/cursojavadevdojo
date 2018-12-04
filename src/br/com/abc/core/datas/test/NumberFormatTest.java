package br.com.abc.core.datas.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        Float valor = 123.456f;
        Locale locJP = new Locale("fr");
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locJP);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locJP);
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
        NumberFormat nf = NumberFormat.getInstance();
    }
}
