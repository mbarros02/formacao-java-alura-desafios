package poo.desafios.formacaoalura.modulo02.produto;

public class Produtos {
    private String nome;
    private double preco;

    public Produtos() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double valor) {
        valor = getPreco() * valor;
        setPreco(getPreco() - valor);
    }
}
