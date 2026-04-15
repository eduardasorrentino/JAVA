package aula04.q04;

public class Filme {
    private String nome;
    private String genero;
    private int ano;
    private int duracao;
    private double somaNotas;
    private int qtdAvaliacoes;

    public Filme(String nome, String genero, int ano, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.somaNotas = 0;
        this.qtdAvaliacoes = 0;
    }

    public void exibirDetalhes() {
        System.out.println("\n===== DETALHES DO TÍTULO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("==============================");
    }

    public void avaliar(int nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Informe um valor entre 0 e 10.");
            return;
        }
        somaNotas += nota;
        qtdAvaliacoes++;
        System.out.println("Avaliação registrada com sucesso!");
    }

    public double calcularMediaAvaliacoes() {
        if (qtdAvaliacoes == 0) return 0;
        return somaNotas / qtdAvaliacoes;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { this.duracao = duracao; }
}
