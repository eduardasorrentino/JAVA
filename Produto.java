package aula04.q05;

public class Produto {
    private String codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidadeEstoque;

    public Produto(String codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibirDetalhes() {
        System.out.println("\n========== PRODUTO ===========");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Tamanho/Peso: " + tamanhoPeso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("Estoque: " + quantidadeEstoque + " unidade(s)");
        System.out.println("==============================");
    }

    public boolean realizarVenda(int quantidade, int formaPagamento, double valorPago) {
        if (quantidadeEstoque <= 0 || quantidade > quantidadeEstoque) {
            System.out.println("Estoque insuficiente. Quantidade disponível: " + quantidadeEstoque);
            return false;
        }

        double valorTotal = valor * quantidade;
        double valorFinal = valorTotal;

        System.out.println("\n========== VENDA ===========");
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor unitário: R$ " + String.format("%.2f", valor));
        System.out.println("Valor total: R$ " + String.format("%.2f", valorTotal));

        switch (formaPagamento) {
            case 1: // Pix
                valorFinal = valorTotal * 0.95;
                System.out.println("Forma de pagamento: Pix");
                System.out.println("Desconto de 5%: -R$ " + String.format("%.2f", valorTotal - valorFinal));
                System.out.println("Valor final: R$ " + String.format("%.2f", valorFinal));
                break;
            case 2: // Espécie
                valorFinal = valorTotal * 0.95;
                System.out.println("Forma de pagamento: Espécie");
                System.out.println("Desconto de 5%: -R$ " + String.format("%.2f", valorTotal - valorFinal));
                System.out.println("Valor final: R$ " + String.format("%.2f", valorFinal));
                if (valorPago >= valorFinal) {
                    double troco = valorPago - valorFinal;
                    System.out.println("Valor pago: R$ " + String.format("%.2f", valorPago));
                    if (troco > 0) {
                        System.out.println("Troco: R$ " + String.format("%.2f", troco));
                    } else {
                        System.out.println("Sem troco.");
                    }
                } else {
                    System.out.println("Valor pago insuficiente. Venda cancelada.");
                    return false;
                }
                break;
            case 3: // Transferência
                valorFinal = valorTotal * 0.95;
                System.out.println("Forma de pagamento: Transferência");
                System.out.println("Desconto de 5%: -R$ " + String.format("%.2f", valorTotal - valorFinal));
                System.out.println("Valor final: R$ " + String.format("%.2f", valorFinal));
                break;
            case 4: // Débito
                valorFinal = valorTotal * 0.95;
                System.out.println("Forma de pagamento: Débito");
                System.out.println("Desconto de 5%: -R$ " + String.format("%.2f", valorTotal - valorFinal));
                System.out.println("Valor final: R$ " + String.format("%.2f", valorFinal));
                break;
            case 5: // Crédito
                valorFinal = valorTotal;
                double parcela = valorFinal / 3;
                System.out.println("Forma de pagamento: Crédito");
                System.out.println("Parcelamento: 3x de R$ " + String.format("%.2f", parcela) + " sem juros");
                System.out.println("Valor final: R$ " + String.format("%.2f", valorFinal));
                break;
            default:
                System.out.println("Forma de pagamento inválida.");
                return false;
        }

        quantidadeEstoque -= quantidade;
        System.out.println("\nVenda realizada com sucesso!");
        System.out.println("Estoque restante: " + quantidadeEstoque + " unidade(s)");
        System.out.println("============================");
        return true;
    }

    // Getters e Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTamanhoPeso() { return tamanhoPeso; }
    public void setTamanhoPeso(String tamanhoPeso) { this.tamanhoPeso = tamanhoPeso; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }
}
