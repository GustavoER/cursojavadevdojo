package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo6 {
    public static void main(String[] args) {
        // Dado valor de um carro descubra quantas vezes ele pode ser parcelado;
        // Porém as parcelas não podem ser menor do que 1000

        double valor = 300000;
        for (int parcela = (int) valor; parcela >= 1; parcela--){
            double valorParcela = valor / parcela;
            System.out.println("Parcela " +parcela+" R$ "+ valorParcela);
        }
    }
}
