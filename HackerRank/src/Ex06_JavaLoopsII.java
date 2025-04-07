package src;

import java.util.*;


public class Ex06_JavaLoopsII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o numero de testes: ");

        int  input = scan.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print("Digite um numero: ");
            int a = scan.nextInt();

            System.out.print("Digite um numero: ");
            int b = scan.nextInt();

            System.out.print("Digite um numero: ");
            int n = scan.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.printf("%d ", sum);
            }

            System.out.println("\n");
        }

        scan.close();
    }
}
