package src;

import java.util.Scanner;

public class Ex05_JavaLoopsI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o numero inteiro: ");
        int N = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %02d = %02d%n", N, i, (i * N));
        }

    }
}
