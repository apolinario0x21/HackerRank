package src;

import java.util.Scanner;

public class Ex07_JavaDatatypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero de testes: ");
        int input = scan.nextInt();

        int i = 0;
        while (i < input) {
            System.out.println("\nQuantidade de testes: " + (i + 1));
            i++;

            try {
                long x = scan.nextLong();
                System.out.printf("\n%d can be fitted in: ", x);

                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15)) System.out.println("* short");
                if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31)) System.out.println("* int");
                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63)) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
    }
}
