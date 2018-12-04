package br.com.abc.core.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = new Locale("it","IT");
        Locale locale2 = new Locale("it","CH");
        Locale locale3 = new Locale("hi","IN");
        Locale locale4 = new Locale("ja");
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 23);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locale3);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locale4);
        System.out.println(df.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));
        System.out.println(df3.format(c.getTime()));
        System.out.println(df4.format(c.getTime()));
        System.out.println(locale.getDisplayCountry(locale));
    }
}
