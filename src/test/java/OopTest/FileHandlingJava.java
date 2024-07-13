package OopTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingJava {
    public static void main(String args[]){
        try{
            //CREATING FILE
            System.out.println("CREATING FILE:-");
            File f0 = new File("D:FileOperationExample.txt");
            System.out.println("\nINFO ABOUT FILE:-");
            System.out.println("The name of the file is: " + f0.getName());
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());
            System.out.println("Is file writeable?: " + f0.canWrite());
            System.out.println("Is file readable " + f0.canRead());
            System.out.println("The size of the file in bytes is: " + f0.length());

            //WRITE IN FILE
            System.out.println("\nWRITING IN FILE:-");
            FileWriter fwrite = new FileWriter(f0);
            fwrite.write("Practice program for file handling - Executing writer");
            fwrite.close();
            System.out.println("Written successfully");

            //READING FROM FILE
            System.out.println("\nREADING FROM FILE:-");
            Scanner sc = new Scanner(f0);
            System.out.println("DATA IN FILE:-");
            while (sc.hasNextLine()) {
                String fileData = sc.nextLine();
                System.out.println(fileData);
            }
            sc.close();
            System.out.println("Read successfully");

            //DELETING FILE
            System.out.println("\nDELETING FILE:-");
            if(f0.delete())
                System.out.println("Deleted successfully");

        }
        catch (IOException e){
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }

}
