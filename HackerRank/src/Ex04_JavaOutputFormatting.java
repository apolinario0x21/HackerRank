package src;

import java.util.Scanner;


public class Ex04_JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite uma palavra/frase: ");
            String inText = scan.next();

            System.out.print("Digite um número inteiro: ");
            int inNumber = scan.nextInt();

            System.out.printf("%-15s%03d%n", inText, inNumber);
        }

        System.out.println("================================");
    }
}