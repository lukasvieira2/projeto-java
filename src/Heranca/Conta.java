package Heranca;


public class Conta {
    private int agencia;
    private int numeroConta;
    private String titularConta;
    private double saldo;
    private boolean isAtiva;

    public Conta(int agencia, double saldo, String titularConta, int numeroConta, boolean isAtiva) {
        this.agencia = agencia;
        this.isAtiva = isAtiva;
        this.saldo = saldo;
        this.titularConta = titularConta;
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public boolean isAtiva() {
        return isAtiva;
    }

    public void setAtiva(boolean ativa) {
        isAtiva = ativa;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo = valor;
    }

    public void sacar(double valor){
        if(valor <= saldo){
            this.saldo -= valor;
        }else {
            System.out.printf("saldo insuficiente. O seu saldo atual é de: %.2f", this.saldo);
        }
    }

}
