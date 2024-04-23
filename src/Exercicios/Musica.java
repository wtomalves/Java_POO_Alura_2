package Exercicios;

public class Musica {
    String artista;
    String titulo;
    String musica;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void fichaTecnica() {
        System.out.println("Artista: " + artista);
        System.out.println("Titulo do Album: " + titulo);
        System.out.println("Titulo da música: " + musica);
        System.out.println("lançado em: " + anoLancamento);

    }

    void avaliarMusica(double nota) {
        avaliacao += nota;
        numAvaliacao++;
    }

    double mediaDeAvaliacao() {
        return avaliacao / numAvaliacao;
    }

    public static void main(String[] args) {
        Musica album = new Musica();

        album.artista = "Tempezinha e Mozartino";
        album.titulo = "Gantalorando";
        album.musica = "O gato subiu no telhado";
        album.anoLancamento = 2024;
        album.fichaTecnica();
        album.avaliarMusica(10);
        album.avaliarMusica(8);
        album.avaliarMusica(9);
        double media = album.mediaDeAvaliacao();
        System.out.println("Média de avaliação: " + media);



    }
}
