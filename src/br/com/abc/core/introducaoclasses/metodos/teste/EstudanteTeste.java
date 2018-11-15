package br.com.abc.core.introducaoclasses.metodos.teste;

import br.com.abc.core.introducaoclasses.metodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Gustavo";
        estudante.idade = 26;
        estudante.notas = new double[]{6.0, 6.0, 5.0};
        estudante.imprimirDados();
    }
}
