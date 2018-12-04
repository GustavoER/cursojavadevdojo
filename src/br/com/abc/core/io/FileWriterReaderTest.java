package br.com.abc.core.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write("Escrevendo uma mensagem no arquivo e pulando " +
                    "\nE pulando uma linha");
            fw.flush();
            fw.close();
            FileReader fileReader = new FileReader("Arquivo.txt");
            char[] texto = new char[10000];
            fileReader.read(texto);
            for (char c : texto) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
