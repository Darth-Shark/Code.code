//Tokenizer class not yet involving interactivity.
//Created by Michael Rollins
//For CTE Software Development 2, 2024
import java.util.*;//Loading the StringTokenizer class.
import java.util.Scanner;//Loading the scanner class.
import java.io.File;//Loading the file class.
import java.io.FileNotFoundException;  //Loading this class to handle errors.


/*
class TokenizerTests {
    public static void main(String[] args) {
        String s = "4";
        Integer i=Integer.valueOf(s);//nothing needs to be imported for this.
        i++;
        System.out.println(i);
    }
}
class TokenizerTests2 {
    public static void main(String[] args) {
        String stringTest = "123, 24 ,  25, 101, 8,0";
        String s;
        int j = 0;
        int k;
        StringTokenizer str = new StringTokenizer(stringTest, ",");
    
        try {
            k = str.countTokens();
            while(str.hasMoreTokens()){//Somewhat hard to follow.
                s = str.nextToken();
                s = s.trim();
                int i=Integer.parseInt(s);
                j = j + i;
            }
            System.out.println("Number of ints: " + k);
            System.out.println("Sum of ints: " + j);//Simple enough.
            System.out.println("Average of ints: " + j/k);
        } catch (NumberFormatException e) {//Will never activate with the code as is.
            System.out.println(e);
        }
    }
}
*/ //Tests with the tokenizer.

class splitStringTokens {//Note to Mr. Gross, letter_frenquency.csv had several blank lines at the end, were these mistakes? 
                        //I deleted them because I couln't figure out a workaround for my code.
    public static void main(String[] args) {
        
        String activeString = new String();
        String s = new String();//Loading variables.
        int lines = 0;
        int frequency = 0;
        float percentage = 0;
        File myfile = new File("letter_frequency.csv");//An afterthought. My code wasn't working before this (for some inexplicable reason :)
        try {
            Scanner myReader = new Scanner(myfile);

            activeString = myReader.nextLine();//Code to skip first line; because the first line dosen't matter.
            System.out.println(activeString);
            while (myReader.hasNextLine()) {//While loops are nice. They were easy to use once I realised they run until boolean = false.
                activeString = myReader.nextLine();
                System.out.println(activeString);        
                StringTokenizer token = new StringTokenizer(activeString, ",");//convinient code.
                s = token.nextToken();//This token is the letter.
                lines++;//This makes the code more reusable.;
                System.out.println("Processing: " + s);//Troubleshooting help.
                s = token.nextToken();//This token is the letter frequency.
                s = s.trim();//Very important!!!
                frequency = frequency + Integer.parseInt(s);//Getting the sum of all frequencies.
                s = token.nextToken();//This token is the letter percentage.
                s = s.trim();
                percentage = percentage + Float.parseFloat(s);//At the start of coding, this was an int. Fixed.
            }
            myReader.close();//Fixed the source leak.
            System.out.println("Processed data for " + lines + " letters.");
            System.out.println("Average letter frequency: " + frequency/lines);//I could just divide by 26, but this works too.
            System.out.println("Total percentage of characters: " + percentage);//Easy. *bow*
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
