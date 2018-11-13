public class ControleDeFluxo5 {
    public static void main(String[] args) {
        // Dado valor de um carro descubra quantas vezes ele pode ser parcelado;
        // Porém as parcelas não podem ser menor do que 1000

        double valor = 300000;
        for (int parcela=1;parcela <= valor; parcela++){
            double valorParcela = valor / parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela " +parcela+" R$ "+ valorParcela);
            }else{
                break;
            }

        }
    }
}
