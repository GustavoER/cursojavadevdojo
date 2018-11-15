package br.com.abc.introducao.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int dias[][] = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;
        // primeiro [] é uma referencia na memoria
        /*for(int i=0; i < dias.length; i++){
            System.out.println(dias[i]);
            for (int j =0; j < dias[i].length;j++){
                System.out.println(dias[i][j]);
            }
        }*/

        int dias2 [][] = {{12},{12,12}};
        for (int ref[]: dias){
            for (int dia: ref){
                System.out.println(dia);
            }
        }
        for (int[] ints : dias2) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
