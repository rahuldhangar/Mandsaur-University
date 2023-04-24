package methods;

import java.util.Scanner;
public class InstantUserCheck {

    static Scanner scanner = new Scanner(System.in);
    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();

        boolean qualified = isUserQualified(salary, creditScore);

        notifyUser(qualified);

    }

    public static boolean isUserQualified(double salary, int creditScore){
        if(salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        }
        else return false;
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congratulations, you have been approved");
        }
        else System.out.println("Sorry, you have been declined");
    }
    public static double getSalary(){
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
}
