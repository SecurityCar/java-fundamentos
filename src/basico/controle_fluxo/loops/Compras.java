package basico.controle_fluxo.loops;

import java.util.concurrent.ThreadLocalRandom;

public class Compras {
    public static void main(String[] args) {
        int mesada = 50;

        while (mesada > 0) {
            Integer valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce de valor " + valorDoce + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
    }

    private static int valorAleatorio(){
        return ThreadLocalRandom.current().nextInt(5, 8);
    }
}
