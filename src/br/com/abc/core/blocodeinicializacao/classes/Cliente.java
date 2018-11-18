package br.com.abc.core.blocodeinicializacao.classes;

public class Cliente {
    // 1 - Alocado espaço na memória para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    private int[] parcelas;

    public Cliente() {
        for (int parcela : this.getParcelas()) {
            System.out.println("Parcela - "+ parcela);
        }
    }
    {
        parcelas = new int[100];
        for(int i=1;i <= 100; i++){
            parcelas[i-1] = i;
        }
        System.out.println("Antes do construtor");
    }
    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
