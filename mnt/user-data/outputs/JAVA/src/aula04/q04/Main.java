package aula04.q04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme filme = null;
        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\n===== PLATAFORMA DE STREAMING =====");
            System.out.println("1 - Cadastrar título");
            System.out.println("2 - Exibir detalhes do título");
            System.out.println("3 - Avaliar título");
            System.out.println("4 - Mostrar média de avaliações");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Nome do título: ");
                    String nome = scanner.nextLine();

                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();

                    System.out.print("Ano de lançamento: ");
                    int ano = Integer.parseInt(scanner.nextLine());

                    System.out.print("Duração (em minutos): ");
                    int duracao = Integer.parseInt(scanner.nextLine());

                    filme = new Filme(nome, genero, ano, duracao);
                    System.out.println("Título cadastrado com sucesso!");
                    break;
                case 2:
                    if (filme == null) {
                        System.out.println("Nenhum título cadastrado.");
                    } else {
                        filme.exibirDetalhes();
                    }
                    break;
                case 3:
                    if (filme == null) {
                        System.out.println("Nenhum título cadastrado.");
                    } else {
                        System.out.print("Digite sua nota (0 a 10): ");
                        int nota = Integer.parseInt(scanner.nextLine());
                        filme.avaliar(nota);
                    }
                    break;
                case 4:
                    if (filme == null) {
                        System.out.println("Nenhum título cadastrado.");
                    } else {
                        System.out.println("Média de avaliações: " + String.format("%.2f", filme.calcularMediaAvaliacoes()));
                    }
                    break;
                case 5:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
