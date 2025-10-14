package poo.desafios.formacaoalura.modulo01.musica;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;
    double media;

    void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    void mediaAvaliacoes() {
        media = avaliacao / numAvaliacoes;
    }

    void fichaTecnica() {
        System.out.println("------- Ficha Técnica do Filme " + titulo + " -------");
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lancamento: " + anoLancamento);
        System.out.println("Avaliacao: " + avaliacao);
        System.out.println("Numero de Avaliacoes: " + numAvaliacoes);
    }


}
