package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {

        int quota = 10;

        System.out.println("Enter the number of sales made");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if (sales >= 10 ){
            System.out.println("Congratulations! You have made it!!");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not make the quota. You were " + salesShort + " sales short.");
        }
    }
}
