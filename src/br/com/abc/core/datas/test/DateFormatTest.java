package br.com.abc.core.datas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dfa = new DateFormat[7];
        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
        for (DateFormat dateFormat : dfa) {
            System.out.println(dateFormat.format(c.getTime()));
        }
    }
}
