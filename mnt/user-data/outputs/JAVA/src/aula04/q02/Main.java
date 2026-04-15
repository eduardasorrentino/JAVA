package aula04.q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("001", "Cliente");
        ContaBancaria contaDestino = new ContaBancaria("002", "Destinatário");

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== SISTEMA BANCÁRIO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = Double.parseDouble(scanner.nextLine());
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = Double.parseDouble(scanner.nextLine());
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Digite o valor para transferência: ");
                    double valorTransferencia = Double.parseDouble(scanner.nextLine());
                    conta.transferir(contaDestino, valorTransferencia);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema bancário.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
