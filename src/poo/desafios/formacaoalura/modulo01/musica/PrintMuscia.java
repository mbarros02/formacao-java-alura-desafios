package poo.desafios.formacaoalura.modulo01.musica;

public class PrintMuscia {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.titulo = "Muscia";
        musica.artista = "Fulano de Tal";
        musica.anoLancamento = 2020;
        musica.numAvaliacoes = 10;
        musica.avaliacao = 4.5;
        musica.setAvaliacao(8.5);
        musica.mediaAvaliacoes();
        musica.fichaTecnica();
    }
}
