package poo.desafios.formacaoalura.modulo02.aluno;

public class Alunos {
    private String nome;
    private int nota1, nota2, nota3, nota4;
    private double mediaNotas;

    public Alunos() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public double calcularMediaNotas() {
        setMediaNotas((getNota1() + getNota2() + getNota3() + getNota4()) / 4);
        return getMediaNotas();
    }
}
