package Revisao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero que voce quer a tabuada: ");
        int num = leia.nextInt();

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n-------------------------\n", i, j, i * j);
            }
        }
    }
}
