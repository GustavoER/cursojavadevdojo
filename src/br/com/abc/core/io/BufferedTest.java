package br.com.abc.core.io;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fw);
            br.write("Escrevendo alguma coisa");
            br.newLine();
            br.write("pula uma linha 3");
            br.flush();
            br.close();
            FileReader fileReader = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
            String s = null;
            while ((s=bf.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
