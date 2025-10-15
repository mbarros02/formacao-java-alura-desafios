package poo.desafios.formacaoalura.modulo02.livro;

public class Livros {
    private String titulo;
    private String autor;

    public Livros() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor;
    }
}
