package poo.desafios.formacaoalura.modulo02.contabancaria;

public class ContaBancaria {
    public String titular;
    private String numConta;
    private double saldo;

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
