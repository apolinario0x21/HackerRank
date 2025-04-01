package src;
import java.util.Scanner;
public class Ex02_JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero int: ex. 42");
        int i = scan.nextInt();

        System.out.println("Informe o numero double: ex.3.14159265");
        Double d = scan.nextDouble();
        scan.nextLine();

        System.out.println("Informe o texto: ex. Welcome to HackerRank's Java tutorials!");
        String s = scan.nextLine();

        System.out.printf("\nString: %s\nDouble: %1.1f\nInt: %d", s, d, i);

        scan.close();
    }
}
