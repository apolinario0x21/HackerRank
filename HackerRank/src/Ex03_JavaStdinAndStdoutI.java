package src;
import java.util.Scanner;

public class Ex03_JavaStdinAndStdoutI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero inteiro: ex. 42");
        int a = scan.nextInt();

        System.out.println("Informe o numero inteiro: ex. 100");
        int b = scan.nextInt();

        System.out.println("Informe o numero inteiro: ex. 125");
        int c = scan.nextInt();

        System.out.printf("\n%d\n%d\n%d", a, b, c);
    }
}

