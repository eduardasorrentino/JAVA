package aula01.q04;

public class Q04 {
    public static void main(String[] args) {
        double salario = 1800.00;

        System.out.println("Salário bruto: R$ " + salario);

        double desconto = 0;
        String descricao = "";

        if (salario <= 900) {
            descricao = "Isento";
            desconto = 0;
        } else if (salario <= 1500) {
            descricao = "Desconto de 5%";
            desconto = salario * 0.05;
        } else if (salario <= 2500) {
            descricao = "Desconto de 10%";
            desconto = salario * 0.10;
        } else {
            descricao = "Desconto de 20%";
            desconto = salario * 0.20;
        }

        double salarioLiquido = salario - desconto;

        System.out.println("IR: " + descricao);
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}
