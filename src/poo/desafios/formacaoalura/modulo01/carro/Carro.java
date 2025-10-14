package poo.desafios.formacaoalura.modulo01.carro;

public class Carro {
    String nome;
    int ano;
    int idade;
    String cor;

    void idade(int ano, int anoAtual) {
        idade = anoAtual - ano;
    }

    void fichaTencnica() {
        System.out.println("---- Ficha Técnica do carro " + nome + "----");
        System.out.println("Carro: " + nome);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
    }
}
