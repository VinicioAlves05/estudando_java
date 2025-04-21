package estruturas_repeticao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        try{
          //Criando o objeto Scanner
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = Scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = Scanner.next();

        System.out.println("digite sua idade: ");
        int idade = Scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = Scanner.nextDouble();

        //Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        }
       catch(InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser numéricos");
       }
    }
}
