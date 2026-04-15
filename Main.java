package aula05.q01;

public class Main {
    public static void main(String[] args) {
        ClinicoGeral clinico = new ClinicoGeral(true, true);
        System.out.println("=== Clínico Geral ===");
        System.out.println("Trabalha no hospital: " + clinico.trabalhaNoHospital);
        System.out.println("Atende em casa: " + clinico.atendeEmCasa);
        clinico.tratarPaciente();
        clinico.receitar();

        System.out.println();

        Cirurgiao cirurgiao = new Cirurgiao(true);
        System.out.println("=== Cirurgião ===");
        System.out.println("Trabalha no hospital: " + cirurgiao.trabalhaNoHospital);
        cirurgiao.tratarPaciente();
        cirurgiao.fazerIncisao();
    }
}
