package aula04.q03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;
        int opcao = -1;

        while (opcao != 4) {
            System.out.println("\n===== CONTROLE DE ESTOQUE =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Exibir detalhes");
            System.out.println("3 - Calcular valor total do estoque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço do produto: ");
                    double preco = Double.parseDouble(scanner.nextLine());

                    System.out.print("Quantidade em estoque: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());

                    produto = new Produto(nome, preco, quantidade);
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
                    } else {
                        System.out.println("Valor total do estoque: R$ " + String.format("%.2f", produto.calcularValorTotal()));
                    }
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
