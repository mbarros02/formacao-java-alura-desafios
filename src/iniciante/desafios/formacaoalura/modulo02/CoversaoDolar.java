package iniciante.desafios.formacaoalura.modulo02;

public class CoversaoDolar {
    public static void main(String[] args) {
        double valorEmDolares = 200;
        double valorUmDolar = 4.94;
        double converteReais = valorEmDolares / valorUmDolar;

        System.out.printf("O valor em dolar: " + valorEmDolares + " convertido para reais é: %.2f", converteReais);

    }
}
