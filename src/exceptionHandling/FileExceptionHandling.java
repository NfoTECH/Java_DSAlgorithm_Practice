package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        createNewFile();
    }

    public static void createNewFile() {
        File file = new File("resources.nonexistent.txt");
        try {
            file.createNewFile();
        }
        catch (Exception e) {       //Exception was used in place of IOException when you don't know the type of
                                    //exception to throw. As "Exception is the super class of all exceptions
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }
}
