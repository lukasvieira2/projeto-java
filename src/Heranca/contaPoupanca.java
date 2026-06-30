package Heranca;

public class contaPoupanca extends Conta{
    public contaPoupanca(int agencia, double saldo, String titularConta, int numeroConta, boolean isAtiva) {
        super(agencia, saldo, titularConta, numeroConta, isAtiva);
    }
    @Override
    public void depositar(double valor){
        double redimento = (getSaldo() + valor) * 0.01;
        super.depositar(valor + redimento);
        }



    }