package poo.desafios.formacaoalura.modulo01.calculadora;

import java.util.Scanner;

public class PrintCalculadora {
    public static void main(String[] args) {

        int numero;
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        System.out.println("O dobro do valor: " + numero + " é " + calculadora.retornaDobro(numero));

    }
}
