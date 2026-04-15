package aula04.q05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;
        int opcao = -1;

        while (opcao != 4) {
            System.out.println("\n===== SISTEMA DE CONTROLE DE PRODUTO =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Exibir detalhes do produto");
            System.out.println("3 - Realizar venda");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Tamanho/Peso: ");
                    String tamanhoPeso = scanner.nextLine();

                    System.out.print("Cor: ");
                    String cor = scanner.nextLine();

                    System.out.print("Valor (R$): ");
                    double valor = Double.parseDouble(scanner.nextLine());

                    System.out.print("Quantidade em estoque: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());

                    produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidade);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        produto.exibirDetalhes();
                    }
                    break;

                case 3:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("Quantidade a vender: ");
                    int qtdVenda = Integer.parseInt(scanner.nextLine());

                    System.out.println("\nForma de pagamento:");
                    System.out.println("1 - Pix (5% de desconto)");
                    System.out.println("2 - Espécie (5% de desconto)");
                    System.out.println("3 - Transferência (5% de desconto)");
                    System.out.println("4 - Débito (5% de desconto)");
                    System.out.println("5 - Crédito (3x sem juros)");
                    System.out.print("Escolha: ");
                    int formaPagamento = Integer.parseInt(scanner.nextLine());

                    double valorPago = 0;
                    if (formaPagamento == 2) {
                        System.out.print("Valor pago em espécie (R$): ");
                        valorPago = Double.parseDouble(scanner.nextLine());
                    }

                    produto.realizarVenda(qtdVenda, formaPagamento, valorPago);
                    break;

                case 4:
                    System.out.println("Encerrando o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
