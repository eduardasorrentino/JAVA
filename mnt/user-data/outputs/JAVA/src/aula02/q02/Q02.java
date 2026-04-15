package aula02.q02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = Double.parseDouble(scanner.nextLine());

        double deducaoINSS = salarioBruto * 0.15;
        double salarioLiquido = salarioBruto - deducaoINSS;

        System.out.println("\n========= CONTRACHEQUE =========");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Dedução INSS: R$ " + String.format("%.2f", deducaoINSS));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
        System.out.println("================================");

        scanner.close();
    }
}
