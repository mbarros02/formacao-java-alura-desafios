package poo.desafios.formacaoalura.modulo02.produto;

import iniciante.desafios.formacaoalura.modulo02.Produto;

public class PrintProdutos {
    public static void main(String[] args) {
        Produtos produto = new Produtos();

        produto.setNome("Celular");
        produto.setPreco(1000);
        produto.aplicarDesconto(0.10);

        System.out.println(produto.getPreco());

    }
}
