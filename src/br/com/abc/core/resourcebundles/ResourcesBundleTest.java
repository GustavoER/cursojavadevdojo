package br.com.abc.core.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundleTest {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("messages",
                new Locale("en","US"));
        System.out.println(rb.getString("hello"));
    }
}
