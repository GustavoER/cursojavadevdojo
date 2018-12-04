package br.com.abc.core.datas.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);

        System.out.println(df.format(c.getTime()));
        String mascara = "yyyy.MM.dd G \'at\' HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(mascara);
        String dataFormatada = simpleDateFormat.format(c.getTime());
        System.out.println(dataFormatada);
    }
}
