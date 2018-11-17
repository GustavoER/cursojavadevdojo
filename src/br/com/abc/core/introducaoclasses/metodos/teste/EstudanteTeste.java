package br.com.abc.core.introducaoclasses.metodos.teste;

import br.com.abc.core.introducaoclasses.metodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Gustavo");
        estudante.setIdade(26);
        estudante.setNotas(new double[]{6.0, 6.0, 6.0});
        estudante.imprimirDados();
    }
}
