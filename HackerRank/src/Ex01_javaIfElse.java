package src;

import java.util.Scanner;

public class Ex01_javaIfElse {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int N = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 == 1) {
            System.out.println("Weird");
        } else if(N >= 2 && N <= 5 ) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N < 21) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}