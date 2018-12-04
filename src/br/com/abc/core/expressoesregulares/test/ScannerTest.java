package br.com.abc.core.expressoesregulares.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 oi");

        while (scanner.hasNext()){
            if(scanner.hasNextBoolean()){
                System.out.println("Boolean");
                System.out.println(scanner.nextBoolean());
            }else if(scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            }
        }
    }
}
