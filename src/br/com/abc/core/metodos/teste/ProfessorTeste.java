package br.com.abc.core.metodos.teste;

import br.com.abc.core.metodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "122.222.232-20";
        prof.matricula = "11122";
        prof.nome = "Marcos";
        prof.rg = "122111-5";

        prof.imprimiProfessor();
    }
}
