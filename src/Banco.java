import Heranca.Conta;
import Heranca.contaCorrente;
import Heranca.contaPoupanca;

public class Banco {

    public static void main(String[] args) {

        Conta cc = new contaCorrente(1001,50,"Frederico",9988770,true);

        Conta cp = new contaPoupanca(1001,100,"Frederico",1122330,true);

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Saldo Conta Corrente\n");

        System.out.printf(" Saldo inicial CC: %.2f,\n", cc.getSaldo());
        cc.depositar(950);
        cc.sacar(500);
        System.out.printf(" Saldo Final cc %.2f\n", cc.getSaldo());


        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Saldo Conta Poupança\n");
        System.out.printf(" Saldo inicial Cp: %.2f,\n", cc.getSaldo());
        cp.depositar(900);
        cp.sacar(500);
        System.out.printf(" Saldo Final cp %.2f", cc.getSaldo());
    }
}