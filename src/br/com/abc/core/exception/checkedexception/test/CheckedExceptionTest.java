package br.com.abc.core.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        abrirArquivo();
    }

    public static void criarArquivo() {
        File file = new File("Teste.txt");
        System.out.println("Arquivo criado?");
        try {
            file.createNewFile();
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void abrirArquivo() {
        File file = new File("Teste.txt");
        try {
            System.out.println("Abrindo criado");
            System.out.println("Executando a leitura do arquivo");
            System.out.println("Escrevendo no arquivo");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();
        }finally {
            System.out.println("Fechar o arquivo");
        }

    }
}
