package aula01.q03;

public class Q03 {
    public static void main(String[] args) {
        double nota1 = 60;
        double nota2 = 70;
        double nota3 = 80;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média: " + media);

        if (media >= 70) {
            System.out.println("Situação: Aprovado");
        } else if (media < 40) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Final");
        }
    }
}
