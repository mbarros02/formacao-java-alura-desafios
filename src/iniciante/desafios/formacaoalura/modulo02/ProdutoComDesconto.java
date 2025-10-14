package iniciante.desafios.formacaoalura.modulo02;

public class ProdutoComDesconto {
    public static void main(String[] args) {
        double precoOriginal = 50;
        double percentualDesconto = 0.10;
        double valorDesconto = precoOriginal * percentualDesconto;
        precoOriginal -= valorDesconto;

        System.out.println(precoOriginal);
    }
}
