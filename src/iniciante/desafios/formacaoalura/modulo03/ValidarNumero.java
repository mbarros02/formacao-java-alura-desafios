package desafios.formacaoalura.modulo03;

import java.util.Scanner;

public class ValidarNumero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1;

        System.out.println("Olá, digite um número: ");
        num1 = scan.nextInt();
        if(num1 >= 0) {
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número negativo!");
        }
    }
}
