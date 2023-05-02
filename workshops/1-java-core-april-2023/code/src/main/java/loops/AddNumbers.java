package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Enter first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number");
            double num2 = scanner.nextDouble();

            System.out.println("Sum is: " + (num1 + num2));

            System.out.println("Would you like to add again? false for no & true for yes");
            again = scanner.nextBoolean();
        }while(again);
    }
}
