package poo.desafios.formacaoalura.modulo01.carro;

import java.util.Scanner;

public class PrintCarro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Digite o nome do carro: ");
        carro.nome = input.nextLine();
        System.out.println("Digite o cor : ");
        carro.cor = input.nextLine();
        System.out.println("Digite o ano de fabricação: ");
        carro.ano = input.nextInt();

        carro.idade(carro.ano, 2025);
        carro.fichaTencnica();
    }
}
