package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your grade letter");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;

        switch(grade){
            case "A":
            case "B":
            case "C":
            case "D":
                message = "Pass";
                break;
            case "F":
                message = "Fail";

            default:
                message = "Invalid Grade";
                break;
        }
        System.out.println( message );
    }
}
