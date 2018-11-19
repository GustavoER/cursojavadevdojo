package br.com.abc.core.modificadorestatico.classes;

public class Cliente {
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço na memória para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    private static int[] parcelas;

    public Cliente() {

    }
    static {
        parcelas = new int[100];
        for(int i=1;i <= 100; i++){
            parcelas[i-1] = i;
        }
        System.out.println(Cliente.getParcelas().length);
    }
    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }
}
