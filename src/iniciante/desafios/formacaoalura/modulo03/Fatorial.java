package iniciante.desafios.formacaoalura.modulo03;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        int numero;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();

        System.out.println("Fatorial no número: " + numero);
        for(int i = numero-1; i >= 1; i--){
            int fatorial = numero * i;
            System.out.println(numero + " x " + i + " = " + fatorial);
        }
    }
}
