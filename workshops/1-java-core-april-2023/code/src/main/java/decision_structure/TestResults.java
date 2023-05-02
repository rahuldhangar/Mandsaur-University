package decision_structure;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        System.out.println("Enter your test score");
        Scanner scanner =new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        String grade;

        if( score < 33 ){
            grade = "F";
        }
        else if( score < 45 ){
            grade = "D";
        }
        else if( score < 60 ){
            grade = "C";
        }
        else if( score < 80 ){
            grade = "B";
        }
        else {
            grade = "A";
        }

        System.out.println("Your grade: " + grade);

    }
}
