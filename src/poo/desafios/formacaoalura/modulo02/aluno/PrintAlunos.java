package poo.desafios.formacaoalura.modulo02.aluno;

import java.util.Scanner;

public class PrintAlunos {
    public static void main(String[] args) {

        Alunos al = new Alunos();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        al.setNome(input.next());
        System.out.println("Digite na sequência, suas 4 notas: ");
        al.setNota1(input.nextInt());
        al.setNota2(input.nextInt());
        al.setNota3(input.nextInt());
        al.setNota4(input.nextInt());

        System.out.println(al.getNome() + ", sua média final é: " + al.calcularMediaNotas());

    }
}
