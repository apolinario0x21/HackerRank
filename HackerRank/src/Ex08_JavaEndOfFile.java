package src;

import java.util.Scanner;

public class Ex08_JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int isNumber = 1;

        while (scan.hasNext()) {
            String isInput = scan.nextLine();
            System.out.printf("%d %s %n", isNumber, isInput);
            isNumber++;
        }

        /* Solução com for
        for (int isNumber = 1; scan.hasNext(); isNumber++) {
            String isInput = scan.nextLine();
            System.out.printf("%d %s %n", isNumber, isInput);
        }
        */
    }
}
