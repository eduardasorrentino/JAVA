package aula05.q02;

public class Pedido {
    private int numero;
    private String descricao;
    private double valor;

    public Pedido(int numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void exibirDetalhes() {
        System.out.println("  Pedido #" + numero + " | " + descricao + " | R$ " + String.format("%.2f", valor));
    }

    public int getNumero() { return numero; }
    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }
}
