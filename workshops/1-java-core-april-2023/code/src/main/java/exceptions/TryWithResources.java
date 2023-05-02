package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        File inputFile = new File("files/numbers.txt");
        File outFile = new File("files/output.txt");
        try(
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outFile)
        ){
            while(fileReader.hasNext()){
                double x = fileReader.nextDouble();
                System.out.println(x);
                fileWriter.println(x);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            System.out.println("Error occured");
        }
    }
}
