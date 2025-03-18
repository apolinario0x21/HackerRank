package src;

import java.util.*;

public class Ex00_welcomeToJava {
    public static void main (String[] args) {
        String str = "Hello ";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adicione uma palavra: ");
        String input = scanner.nextLine();

        System.out.print("Adicione outra palavra: ");
        String inputTwo = scanner.nextLine();

        System.out.println(str + input.substring(0, 1).toUpperCase() + input.substring(1));
        System.out.print(str + inputTwo.substring(0, 1).toUpperCase() + inputTwo.substring(1));

        scanner.close();
    }
}
