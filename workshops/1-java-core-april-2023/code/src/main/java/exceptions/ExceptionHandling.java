package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        File file = new File(" /nonexistentfile.txt");
        try{
            file.createNewFile();
        }catch(IOException e){
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
