//katelynn.graham@malad.us
//Katelynn Graham
//G-crafts
//Software and Programming Dev 11B
//User input for card game assignment
//Mr. Gross
//Plus added debugging 5-8-2024
//Edited for Final Project Semester 2
//Edits by Katelynn Graham

//Importing used imports
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;/*I think you can use java.io.*; to import all of these on one line. I often import java.util.* -Michael*/
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//Creating the class called CardGameUserInput
public class CardGameUserInput {

    //Creating the main driver method for testing the code
    public static void main(String[] args) {

        //Creating a try catch method for testing the code        
        try{

            //creating a filewriter to write in the new file called userinputdata.txt
            FileWriter fWriter = new FileWriter("userinputdata.txt");
            
            //Creating a BufferWriter to write the characters into the file and the new lines
            BufferedWriter buffWriter = new BufferedWriter(fWriter);    /*Good use of writers here. -Michael*/

            // Creating a new scanner 
            Scanner scanner = new Scanner(System.in);

            //Creating a for loop that will loop the data 4 times, which means that each prompt will be repeated 4 times for 4 different players
            for (int x = 0; x<4; x++){

                //Prompt for user name
            System.out.print (" Enter user name here: ");
                String userName = scanner.nextLine();

                //Prompt for the player number
                System.out.print (" Enter player number here (player 1, player 2, player 3, or player 4): ");
                String playerNumber = scanner.nextLine();

                //Prompt for the game number
                System.out.print (" Enter game number here (game 1, game 2, game 3, or game 4): ");
                String gameNumber = scanner.nextLine();


                //Writing the user name, player name, and game number that was entered into the file
                buffWriter.write(userName);
                buffWriter.newLine(); 
                buffWriter.write(playerNumber);
                buffWriter.newLine(); //Making it so it's not all on the same line
                buffWriter.write(gameNumber);
                buffWriter.newLine();
            }

            //Closing the scanner, bufferedwriter, and filewriter
            scanner.close();
            buffWriter.close();/*This step is important to remeber! -Michael*/
            fWriter.close();

            //Catching an IOException called e for this block of code
        } catch (IOException e){
            e.printStackTrace();
        }
          //Reading from the file 4 times
    String filePath = "userinputdata.txt"; {
        
        try {
    
                //Making the scanner that will read from student.txt
                Scanner scanner = new Scanner(new File(filePath));
    
                // for method for reading from the file with the scanner
                for (int x = 0; x<4; x++){
                    //Reads from the input information in the file 5 times
                    String userName = scanner.nextLine();
                     String playerNumber = scanner.nextLine();/*A bunch of unused stuff for a leaderboard? I never got that advanced in my card game. -Michael*/
                     String gameNumber = scanner.nextLine();
    
                     //Prints out all of the information into the file with their own lines
                     System.out.println(filePath);               
                }
                
                //Closing the scanner
                scanner.close();
    
                //Catching the filenotfoundexception
              } catch (FileNotFoundException e) {
                e.printStackTrace();  
             }
    }/*What happened to the spacing over here? It is a pet peev of mine how difficult it is to revmove tabs compared to adding them. -Michael*/

    }
}
