//Scanner class involving interactivity.
//Created by Michael Rollins
//For CTE Software Development 2, 2024
import java.util.InputMismatchException;
import java.util.Scanner; //user input.
//import java.util.*; //arraylists and collections. Unused.
import java.util.Random; //random number generator.
import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
//import java.io.PrintWriter;  //Import the PrintWritter class
//import java.io.BufferedWriter; // Import the BufferedWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors



class scannerInteractive{ //An assignment heavily involving the scanner. 
    public static void main(String[] args) {
        String user = new String();
        int age = -1;
        boolean isError = false; //initializing my variables.
        float height = -1;
        Random rand = new Random();
         try (Scanner inputScanner = new Scanner(System.in)) {//I wounder if it is necesary to use more than one catch block here?
            System.out.println("Please insert your name.");        
            user = inputScanner.nextLine();
            try { //solution to
                System.out.println("Hello " + user.trim() + "! Please insert your age.");        
                age = inputScanner.nextInt();
                try {
                    System.out.println("I have never met a " + age + "-year old before. Please insert your height in ft.");        
                    height = inputScanner.nextFloat();
                    try {
                        System.out.println("You are " + height + " feet tall. Don't worry, you could be a late bloomer!");
                        System.out.println();
                        System.out.println("Height " + height + "ft, age " + age + " years, name " + user.trim() + ".");
                        System.out.println();
                        System.out.println("Processing Data.");
                        System.out.println(".");
                        System.out.println("..");
                        System.out.println("...");
                        int a = rand.nextInt(100); //Some randoms, because why not.
                        System.out.println("You are taller than " + a + "% of users.");
                        int b = rand.nextInt(100);
                        System.out.println("You are older than " + b + "% of users.");
                        int c = rand.nextInt(100);
                        System.out.println("You have a name longer than " + c + "% of users.");//This amuses me.
                        System.out.println();
                    } finally {}//This exists because the program throws an error if it dosen't.
                } catch(InputMismatchException e) {
                    System.out.println(e); //error detection.
                    System.out.println("Input was not a float! (floating point number)");
                    isError = true; //To remember an error was thrown.
                }
            } catch(InputMismatchException e) {
                System.out.println(e);
                System.out.println("Input was not an int! (whole number)"); //Do I actually need multiple catch blocks, or will the first one suffice?
                isError = true;//Multiple catch blocks let me see what error occured.
            }
        } catch(InputMismatchException e) {
            System.out.println(e);//This code will never matter.
            System.out.println("Input was not a string! (string of characters)"); //You can't get a type mismatch with a string.
            isError = true;
        } 
        System.out.println();
        System.out.print("Program aborted"); //End program.
        if (isError == true) {
            System.out.print(" due to error"); //Acknoledge any issues.
        }
        System.out.println("."); //This code works, but it looks a bit silly.
        System.out.println("Have a nice day.");
        System.out.println();
    }
}
class firstNameBasis{
    public static void main(String[] args) {
        String nameFull = new String();
        String nameFirst = new String();
        String nameLast = new String();
        boolean isFirst = true;
        nameLast = "MISSINGNO"; //Used in debugging.
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.println("Please insert your name in the format 'first last'.");
            nameFull = inputScanner.nextLine();
            nameFull = nameFull.trim(); //Might as well.
            System.out.println("Name registered: " + nameFull);
            System.out.println();
            for (String namePart: nameFull.split(" ", 2)) {
                if (isFirst == true) {
                    nameFirst = namePart;
                    isFirst = false; // This line matters!
                } else {
                    nameLast = namePart; //Will not run without a space.
                }
            }
            if (nameLast == "MISSINGNO") { //to detect unsuccessfull split.
                System.out.println("Thank you " + nameFull + ". I wish I knew your full name!"); //If split was unsuccessful.
            } else {
                System.out.println("Thank you Mr(s). " + nameLast + "."); //If nameFull was split.
                System.out.println("Or can I call you " + nameFirst + "?");
            }
            System.out.println("Thank you for your help.");
            System.out.println("Have a nice day.");
        }
    }
}

class scannerError{ //an issue I encountered while coding.
    public static void main(String[] args) {
        int num1;
        int num2;
        try (Scanner inputScanner = new Scanner(System.in)) {
            num1 = inputScanner.nextInt();
        }
        try (Scanner inputScanner = new Scanner(System.in)) {
            num2 = inputScanner.nextInt();
        }
        System.out.println(num1 + num2);
    }
}
class scannerErrorFixed{ //the solution(s).
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        try (Scanner inputScanner = new Scanner(System.in)) {
            num1 = inputScanner.nextInt();
            try {
                num2 = inputScanner.nextInt();
            } finally {
                System.out.println(num1 + num2);
            }
        }
    }
}



class censusToTxt { //An assignment involving writting a new file.
    public static void main(String[] args) {
        String lastName = new String();//loading all my strings.
        String firstName = new String();
        firstName = "missingNo"; //to catch a later error.
        boolean unimportant = true; //this might never matter.
        String schoolName = new String();
        String gradeName = new String();//many strings.
        File myfile = new File("student.txt"); //This is a minor error I am unsure how to fix.
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.println("Thank you, student, for participating in this survey. Please insert your last name below.");
            lastName = inputScanner.nextLine();
            System.out.println("Thank you. Please insert your first name below.");//this is pretty routine.
            firstName = inputScanner.nextLine();
            System.out.println("Thank you. Please insert the name of your school below.");
            schoolName = inputScanner.nextLine();
            System.out.println("Thank you. Please insert your gade (freshman, sofmore, etc.) below.");
            gradeName = inputScanner.nextLine();
            System.out.println("Thank you, Mr(s). " + lastName.trim() + ".");//My new program is very polite.
            try {
                FileWriter myWriter = new FileWriter("student.txt");
//                BufferedWriter buffWriter = new BufferedWriter("student.txt");
                myWriter.write("Census results for student " + firstName.trim() + " " + lastName.trim() + " \n"); //lots of trims.
//                buffWriter.newLine();
                myWriter.write("They are a " + gradeName.trim() + " at their school \n");
//                buffWriter.newLine();
                myWriter.write("The above mentioned school is " + schoolName.trim() + " \n");
//                buffWriter.newLine();
                myWriter.close();
//                buffWriter.newLine();
            } catch (IOException e) {
                System.out.println(e);
                e.printStackTrace();
                System.out.println("A .txt file with that name already exists, would you like to delete it?");//I don't think this message will ever appear?
                System.out.println("Please answer with a boolean value of either 'true' or 'false'.");
                unimportant = inputScanner.nextBoolean();
                System.out.println("fileDeleted = " + unimportant); //double check the result.
                System.out.println("On second thought, I don't actually know how to delete files. :P"); //I am too lazy to actually do this.
            }
        } catch(InputMismatchException e) {//This error can only be thrown by the above boolean.
            System.out.println(e);
            System.out.println("Invalid input type! Please restart the program.");
        }
        myfile.exists();//Fixed that above minor error.
        System.out.println();
        System.out.println("I feel like I known you so much better now, " + firstName.trim() + ".");// :)
    }  
}
class txtfromCensus {
    public static void main(String[] args) {
        try {
            File myFile = new File("student.txt");//The pathname is a string, so I could use an input scanner to determine what file this reads off. Useful.
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); //This code is basically stolen from w3 schools. It contains a while loop, which is not somethihng I have implimentd before.
                System.out.println(data);
            }
            myReader.close();//Solved the source leak!
        } catch (FileNotFoundException e) {
            System.out.println("An issue occured trying to access student.txt!");//Error message
            e.printStackTrace();
        }
    }
}
