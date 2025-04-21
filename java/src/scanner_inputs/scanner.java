package scanner_inputs;

import java.util.Locale;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        
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
}
