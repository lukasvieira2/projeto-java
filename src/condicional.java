import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        leia.useLocale(Locale.US);

        System.out.println("Digite uma altura em metros: ");
        double altura = leia.nextDouble();

        System.out.println("Digite um peso: ");
        double peso = leia.nextDouble();

        /*System.out.printf("O peso %.2f e a altura é %.2f", peso,altura                           );
*/
        double imc = peso / Math.pow(altura,2);

        if (imc < 18.5){
            System.out.println("*****Abaixo do peso*****");
        }else if (imc >= 18.5 & imc <25){
            System.out.println("*****Parabens você está no peso ideal*****");
        }else if(imc >=25 & imc < 30){
            System.out.println("*****levemente acima do peso*****");
        }else if (imc >= 30 & imc > 35){
            System.out.println("*****obesidade severa/mórbida*****");
        }






    }
}
