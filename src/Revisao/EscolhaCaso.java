package Revisao;

import java.util.Scanner;
public class EscolhaCaso {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha uma das opções abaixo");
        System.out.println("""
                [1] Somar
                [2] Subtrair
                [3] Multiplicar
                [4] Divisão
                [5] Potência
                [6] Raiz Quadrada
                [7] Resto Da Divisão
                [0] sair
                \s""");
        System.out.print("opção: ");
        int opcao = leia.nextInt();

        System.out.println("Digite o primeiro numero: ");
        double numero1 = leia.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = leia.nextDouble();
        double resultado = 0 ;


        switch (opcao){
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            case 5:
                resultado = Math.pow(numero1,numero2);
                break;
            case 6:
                resultado = Math.sqrt(numero1)+Math.sqrt(numero2);
                break;
            case 7:
                resultado = numero1 % numero2;
            case 0:
                break;
            default:
                System.out.println("opção invalida");

        }
        System.out.printf("O resultado é iqual a %.2f", resultado);
    }
}
