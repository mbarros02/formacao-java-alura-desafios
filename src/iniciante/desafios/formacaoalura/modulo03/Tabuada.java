package iniciante.desafios.formacaoalura.modulo03;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int num;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10 para gerar a tabuada: ");
        num = ler.nextInt();

        if(num >= 1 && num <= 10){
        System.out.println("Tabuada do número: " + num);
        for(int i = 1; i <= 10; i++){
            int mult = num * i;
            System.out.println(num + " x " + i + " = " + mult);
            }
        } else {
            System.out.println("Número inválido!");
        }
    }
}
