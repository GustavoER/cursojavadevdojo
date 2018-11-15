package br.com.abc.introducao;

import java.text.MessageFormat;

public class RelatorioPendencia {
    public static void main(String[] args) {
        String nome = "Gustavo";
        String endereco = "Constantino Monteiro Viera";
        String telefone = "16991588506";

        System.out.println(MessageFormat.format("O {0} domiciliado no endereço {1} e telefone {2} não possui nenhum tipo de pendência",nome,endereco,telefone));
    }
}
