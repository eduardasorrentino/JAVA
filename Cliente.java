package aula05.q02;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos;

    public Cliente(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public void fazerPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido #" + pedido.getNumero() + " realizado por " + nome + ".");
    }

    public void exibirPedidos() {
        System.out.println("\nPedidos do cliente " + nome + ":");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido realizado.");
        } else {
            for (Pedido p : pedidos) {
                p.exibirDetalhes();
            }
        }
    }

    public String getNome() { return nome; }
    public List<Pedido> getPedidos() { return pedidos; }
}
