package exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ThrowingException {
    public static double calculatePay( double hours, double payRate) throws NegativeInputException{
        if(hours > 40){
            throw new IllegalArgumentException("Hours must be less than or equal to 40");
        }else if(hours < 0 || payRate < 0){
            throw new NegativeInputException("Negative input not permitted");
        }
        return hours * payRate;
    }
    public static void rethrowException() throws IOException {
        File file = new File("nonexistentfile.txt");
        file.createNewFile();
        Scanner fileReader = new Scanner(file);
    }

    public static void main(String[] args) throws NegativeInputException{
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hours = scanner.nextDouble();

        System.out.println("What is your hourly pay rate?");
        double rate = scanner.nextDouble();
        scanner.close();

        double payRate = calculatePay(hours, rate);

        System.out.println("Gross Pay: " + payRate);

    }

}
