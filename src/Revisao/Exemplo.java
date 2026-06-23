package Revisao;

import  java.util.Scanner;
public class Exemplo {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String  nome;
        int idade;

        System.out.println("Digite seu nome? ");
        nome = leia.nextLine();

        System.out.println("digite sua idade? ");
        idade = Integer.parseInt(leia.nextLine());

        System.out.println("O nome da pessoa é " + nome +" e ele tem " +idade);
        System.out.printf("O nome da pessoa é %s e ele tem %d",nome,idade);


                System.out.print("Digite um numero que voce quer a tabuada: ");
                int num = leia.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %d = %d\n", num, i, num * i);
                }

    }
}

