package aula03.q02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a nota 2: ");
        double nota2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite a nota 3: ");
        double nota3 = Double.parseDouble(scanner.nextLine());

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("\nAluno: " + nome);
        System.out.println("Média: " + String.format("%.2f", media));

        if (media >= 70) {
            System.out.println("Situação: Aprovado");
        } else if (media < 40) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Final");
        }

        scanner.close();
    }
}
