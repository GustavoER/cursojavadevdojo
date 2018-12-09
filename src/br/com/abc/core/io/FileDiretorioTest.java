package br.com.abc.core.io;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("folder");
        boolean mkdir = diretorio.mkdir();
        File file = new File(diretorio,"ArquivoTexto.txt");
        file.createNewFile();
        File busca = new File("folder");
        for (String s : busca.list()) {
            System.out.println(s);
        }
    }
}
