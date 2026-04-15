package aula05.q02;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nome;
    private List<Pedido> pedidosEmitidos;

    public Vendedor(String nome) {
        this.nome = nome;
        this.pedidosEmitidos = new ArrayList<>();
    }

    public void emitirPedido(Pedido pedido) {
        pedidosEmitidos.add(pedido);
        System.out.println("Pedido #" + pedido.getNumero() + " emitido pelo vendedor " + nome + ".");
    }

    public void exibirPedidosEmitidos() {
        System.out.println("\nPedidos emitidos pelo vendedor " + nome + ":");
        if (pedidosEmitidos.isEmpty()) {
            System.out.println("Nenhum pedido emitido.");
        } else {
            for (Pedido p : pedidosEmitidos) {
                p.exibirDetalhes();
            }
        }
    }

    public String getNome() { return nome; }
    public List<Pedido> getPedidosEmitidos() { return pedidosEmitidos; }
}
