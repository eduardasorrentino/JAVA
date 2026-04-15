package aula04.q01;

public class Funcionario {
    private String matricula;
    private String nome;
    private double salarioBruto;

    public Funcionario(String matricula, String nome, double salarioBruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public double calcularInss() {
        return salarioBruto * 0.15;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - calcularInss();
    }

    public void exibirContracheque() {
        System.out.println("\n========= CONTRACHEQUE =========");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Dedução INSS: R$ " + String.format("%.2f", calcularInss()));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", calcularSalarioLiquido()));
        System.out.println("================================");
    }

    // Getters e Setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getSalarioBruto() { return salarioBruto; }
    public void setSalarioBruto(double salarioBruto) { this.salarioBruto = salarioBruto; }
}
