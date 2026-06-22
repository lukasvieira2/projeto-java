import  java.util.Scanner;
public class Main {
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

    }
}