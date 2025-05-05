package calculadora;

import java.util.Scanner;

public class Calculadora {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o operador (+, -, *, /):");
            char operador = scanner.next().charAt(0);

            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();

            double resultado = 0;
            boolean operacaoValida = true;

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: divisão por zero!");
                        operacaoValida = false;
                    }
                    break;
                default:
                    System.out.println("Operador inválido!");
                    operacaoValida = false;
            }

            if (operacaoValida) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.print("Deseja fazer outra operação? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.println("Calculadora finalizada.");
        scanner.close();
    }
}

