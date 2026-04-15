package aula02.q01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repetir = "sim";

        while (repetir.equalsIgnoreCase("sim")) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

            System.out.print("Deseja fazer um novo cadastro? (sim/não): ");
            repetir = scanner.nextLine();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
