import Heranca.Conta;
import Heranca.contaCorrente;
import Heranca.contaPoupanca;

public class Banco {

    public static void main(String[] args) {

        Conta cc = new contaCorrente(1001,true,50,"Frederico",9988770);

        Conta cp = new contaPoupanca(1001,true,100,"Frederico",1122330);

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Saldo Conta Corrente");

        System.out.printf("Saldo inicial CC: %.2f,", cc.getSaldo());
        cc.depositar(950);
        cc.sacar(500);
        System.out.printf("Saldo Final cc %.2f",cc.getSaldo());


        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Saldo Conta Poupança");
        System.out.printf("Saldo inicial Cp: %.2f,", cc.getSaldo());
        cp.depositar(900);
        cp.sacar(500);
        System.out.printf("Saldo Final cp %.2f",cc.getSaldo());
    }
}