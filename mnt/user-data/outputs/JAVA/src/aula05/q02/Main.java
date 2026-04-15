package aula05.q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        System.out.print("Nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();
        Vendedor vendedor = new Vendedor(nomeVendedor);

        int opcao = -1;
        int numeroPedido = 1;

        while (opcao != 0) {
            System.out.println("\n===== SISTEMA DE PEDIDOS =====");
            System.out.println("1 - Fazer pedido (cliente)");
            System.out.println("2 - Emitir pedido (vendedor)");
            System.out.println("3 - Exibir pedidos do cliente");
            System.out.println("4 - Exibir pedidos do vendedor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Descrição do pedido: ");
                    String descCliente = scanner.nextLine();
                    System.out.print("Valor do pedido: R$ ");
                    double valorCliente = Double.parseDouble(scanner.nextLine());
                    Pedido pedidoCliente = new Pedido(numeroPedido++, descCliente, valorCliente);
                    cliente.fazerPedido(pedidoCliente);
                    break;
                case 2:
                    System.out.print("Descrição do pedido: ");
                    String descVendedor = scanner.nextLine();
                    System.out.print("Valor do pedido: R$ ");
                    double valorVendedor = Double.parseDouble(scanner.nextLine());
                    Pedido pedidoVendedor = new Pedido(numeroPedido++, descVendedor, valorVendedor);
                    vendedor.emitirPedido(pedidoVendedor);
                    break;
                case 3:
                    cliente.exibirPedidos();
                    break;
                case 4:
                    vendedor.exibirPedidosEmitidos();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
