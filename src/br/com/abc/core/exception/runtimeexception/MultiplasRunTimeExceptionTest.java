package br.com.abc.core.exception.runtimeexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRunTimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Erro");
        }
         catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }

        try{
            talvezLanceException();
        }catch (SQLException |IOException e) {
            e.printStackTrace();
        }
    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException, IOException{

    }
}
