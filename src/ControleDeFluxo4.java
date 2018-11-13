public class ControleDeFluxo4 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10) {
            contador++;
            System.out.println(contador);
        }
        contador = 0;
        do {
            System.out.println("Dentro do while : " + contador);
            contador++;
        } while (contador < 10);
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i: " + i);
            if(i == 5){
                break;
            }
        }
    }
}
