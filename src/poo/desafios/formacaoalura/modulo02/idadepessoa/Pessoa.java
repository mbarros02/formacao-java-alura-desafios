package poo.desafios.formacaoalura.modulo02.idadepessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void MaiorDeIdade() {
        if (getIdade() >= 18) {
            System.out.println("A pessoa " + getNome() + " é maior de Idade!");
        } else {
            System.out.println("A pessoa " + getNome() + " é menor de Idade");
        }
    }
}
