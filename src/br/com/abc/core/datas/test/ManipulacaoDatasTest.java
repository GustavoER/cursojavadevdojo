package br.com.abc.core.datas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDatasTest {
    public static void main(String[] args) {
        Date date = new Date(1_0000000000000l);
        System.out.println(date);
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
    }
}
