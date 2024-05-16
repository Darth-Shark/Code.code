//katelynn.graham@malad.us
    //KatelynnGraham
    //G-crafts
    // Reading from the StudentInfoWriterFile
    //Software and Programming Dev 11B
    // Mr. Gross
    //February 2, 2024
    //Any added or changed code by Katelynn Graham
    // for Kim Gross
    //Software and programming 11B
    //Final Project for semester 2
    // May 8, 2024

 //Adding the imports for the file, the filenotfoundexception, and the scanner
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ReadingFromUserInputDataInCardgame {
    
   
    
    //Creating the filereader for student.txt file which comes from the CardGameUserInput file named userinputdata.txt
        
        //The main driver method
        public static void main(String[] args) {
    
            //Creating the filepath string to the student.txt file
            String filePath1 = "userinputdata.txt";
    
            //Trying to read the data from the file
            try {
    
                //Making the scanner that will read from student.txt
                Scanner scanner = new Scanner(new File(filePath1));
    
                // While method for reading from the file with the scanner
                while (scanner.hasNextLine()) {
    
                    //Reading from each line in the file
                    String cardGameUserInputData = scanner.nextLine();
                    //Printing out each line of the file until there are no more lines of text
                    System.out.print(cardGameUserInputData);
                }
                
                //Closing the scanner
                     scanner.close();
                //Catching the filenotfoundexception
            }catch (FileNotFoundException e) {
                e.printStackTrace();
}
}
}