package src;

import java.util.Scanner;

public class Ex09_JavaStaticInitializerBlock {

    static int largura, altura;
    static boolean flag = true;
    static Scanner scan = new Scanner(System.in);

    static {
        largura = scan.nextInt();
        altura = scan.nextInt();
        scan.close();

        try {
            if (largura <= 0 || altura <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = largura * altura;
            System.out.printf("Area: %d", area);
        }

    }
}
