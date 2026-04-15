package aula03.q03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 0) {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite o segundo número: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    }
                    break;
                case 4:
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
            }
        }

        scanner.close();
    }
}
