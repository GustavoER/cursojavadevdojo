package br.com.abc.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        // primeira forma
        int[] numeros = new int[5];
        // segunda forma
        int[] numeros2 ={1,2,3,4,5};
        // terceira forma
        int [] numeros3 = new int[]{1,2,3,4,5};
        for (int i=0;i < numeros2.length;i++){
            System.out.println(numeros2[i]);
        }
        System.out.println("");
        for(int aux: numeros3){
            System.out.println(aux);
        }
    }
}
