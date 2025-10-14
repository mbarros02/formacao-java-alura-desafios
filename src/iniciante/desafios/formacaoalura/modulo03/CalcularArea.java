package iniciante.desafios.formacaoalura.modulo03;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção: ");
        System.out.println("1. Calcular a area do quadrado.");
        System.out.println("2. Calcular a area do circulo.");
        opcao = scan.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Calcula a area do quadrado");
                break;
            case 2:
                System.out.println("Circulo");
        }
    }

}
