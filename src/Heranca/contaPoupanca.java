package Heranca;

public class contaPoupanca extends Conta{
    public contaPoupanca(int agencia, boolean isAtiva, double saldo, String titularConta, int numeroConta) {
        super(agencia, isAtiva, saldo, titularConta, numeroConta);
    }
    @Override
    public void depositar(double valor){
        double redimento = (getSaldo() + valor) * 0.01;
        super.depositar(valor + redimento);
        }



    }