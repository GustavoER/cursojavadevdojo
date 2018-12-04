package br.com.abc.core.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        if(!file.exists()) {
            try {
                boolean result;
                result = file.createNewFile();
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(file.getAbsolutePath());
            file.delete();
        }
    }
}
