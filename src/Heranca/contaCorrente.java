package Heranca;

public class contaCorrente extends Conta{

    public contaCorrente(int agencia, double saldo, String titularConta, int numeroConta, boolean isAtiva) {
        super(agencia, saldo, titularConta, numeroConta, isAtiva);
    }

    @Override
    public void sacar(double valor){
        double taxaSaque = valor * 0.005;
        super.sacar(valor + taxaSaque);
    }
}
