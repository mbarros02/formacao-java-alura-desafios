package iniciante.desafios.formacaoalura.modulo03;

import java.util.Scanner;

public class ValidarDoisNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite o número 01: ");
        num1 = scan.nextInt();
        System.out.println("Digite o número 02: ");
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("Os números são diferentes!");
            System.out.println("O número 01 é maior que o número 02.");
        } else if (num2 > num1) {
            System.out.println("Os números são diferentes!");
            System.out.println("O número 02 é maior que o número 01.");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
