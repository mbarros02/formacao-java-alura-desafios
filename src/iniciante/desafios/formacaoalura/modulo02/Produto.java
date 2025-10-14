package iniciante.desafios.formacaoalura.modulo02;

public class Produto {
    public static void main(String[] args) {
        double precoProduto = 100.10;
        int quantidade = 25;
        double valorEstoque = precoProduto * quantidade;

        System.out.println("O valor total no estoque é: " + valorEstoque);
    }
}
