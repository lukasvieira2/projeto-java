package Revisao;

import java.util.Scanner;
public class Enquanto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String continuar = "s";

        while(continuar.equalsIgnoreCase("s")){

            System.out.println("Olá mundo!");
            System.out.println("Quer continuar");
            continuar = leia.nextLine();
        }
    }
}
