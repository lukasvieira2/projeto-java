package Heranca;

public class contaCorrente extends Conta{

    public contaCorrente(int agencia, boolean isAtiva, double saldo, String titularConta, int numeroConta) {
        super(agencia, isAtiva, saldo, titularConta, numeroConta);
    }

    @Override
    public void sacar(double valor){
        double taxaSaque = valor * 0.005;
        super.sacar(valor + taxaSaque);
    }
}
