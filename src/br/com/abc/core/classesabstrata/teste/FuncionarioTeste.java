package br.com.abc.core.classesabstrata.teste;

import br.com.abc.core.classesabstrata.classes.Funcionario;
import br.com.abc.core.classesabstrata.classes.Gerente;
import br.com.abc.core.classesabstrata.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        // classe abstrata não pode ser inicializada
        //Funcionario f = new Funcionario("Marcos","20102-20", 2000);
        Gerente g = new Gerente("Anna","11122-20", 2000);
        Vendedor v = new Vendedor("Camila","222111-4",1500,5000);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println(v);
    }
}
