package estruturas_repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class whileEx {
    public static void main(String[] args) {
        
        // while(expressão booleana de validação)
        // {
        // comando que será executado até que a
        // expressão de validação torne-se falsa
        // }

        double mesada = 50.00;

        while (mesada>0) {
            double valorDoce = valorAleatorio();
            
            if(valorDoce > mesada)
              valorDoce = mesada;

              System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
              mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Vinicio gastou toda a sua mesada em doces");

 }
 private static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2, 8);
 }
}
