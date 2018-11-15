package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // valores default ao criar array e não declarar valor
        //byte, short, int, long, float, double = 0
        // char '\u0000'''
        // reference null
        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";
        int tamanho = nomes.length;
        for (int i=0; i < tamanho; i++){
            System.out.println(nomes[i]);
        }
    }
}
