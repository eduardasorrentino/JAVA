package aula04.q01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = Double.parseDouble(scanner.nextLine());

        Funcionario funcionario = new Funcionario(matricula, nome, salarioBruto);
        funcionario.exibirContracheque();

        scanner.close();
    }
}
