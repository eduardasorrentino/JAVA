package aula04.q02;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public void consultarSaldo() {
        System.out.println("\nSaldo atual: R$ " + String.format("%.2f", saldo));
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo == 0) {
            System.out.println("Saldo zerado. Operação não permitida.");
            return;
        }
        if (valor <= 0 || valor > saldo) {
            System.out.println("Valor inválido ou saldo insuficiente.");
            return;
        }
        saldo -= valor;
        System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (saldo == 0) {
            System.out.println("Saldo zerado. Operação não permitida.");
            return;
        }
        if (valor <= 0 || valor > saldo) {
            System.out.println("Valor inválido ou saldo insuficiente.");
            return;
        }
        saldo -= valor;
        destino.saldo += valor;
        System.out.println("Transferência de R$ " + String.format("%.2f", valor) + " para " + destino.getTitular() + " realizada com sucesso.");
    }

    // Getters e Setters
    public String getNumeroConta() { return numeroConta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
}
