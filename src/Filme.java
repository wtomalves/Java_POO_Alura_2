public class Filme {
    String nome;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
    }

    double avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
        return somaDasAvaliacoes;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
