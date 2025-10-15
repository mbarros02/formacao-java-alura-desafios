package poo.desafios.formacaoalura.modulo02.livro;

import java.util.Scanner;

public class PrintLivro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Livros l = new Livros();

        System.out.println("Digite o nome do livro: ");
        l.setTitulo(scan.nextLine());
        System.out.println("Digite o nome do autor: ");
        l.setAutor(scan.nextLine());

        System.out.println(l.toString());
    }
}
