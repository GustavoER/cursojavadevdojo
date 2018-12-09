package br.com.abc.core.serializacao.test;

import br.com.abc.core.serializacao.classes.Aluno;

import java.io.*;

public class SerializacaoTest {
    public static void main(String[] args) {
        //gravadorAluno();
        leitorAluno();
    }
    public static void gravadorAluno(){
        Aluno aluno = new Aluno(1L, "William Suane","123456");
        try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            obj.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void leitorAluno(){
        try(ObjectInputStream obj = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno)obj.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
