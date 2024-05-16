//katelynn.graham@malad.us
//G-crafts code
//For Software and Programming Dev 11 
//For Kim Gross
//May 8th, 2024
//Semester 2 final project

//Creating my imports
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.ErrorManager;/*unused import. I have never used this one before, I wonder what it does? -Michael*/

//creating the gamestate class that implemets serializable
public class GameState implements Serializable {

    
    //main driver method
    public static void main(String[] args) {
        //Creating booleans
    boolean save; /*unused boolean -Michael*/
    boolean game; /*also unused, not sure where you are actually going with these. -Michael*/
    
    try{
        //creating a new scanner
        Scanner scan = new Scanner(System.in);/*this is the leaky scanner. I would reccomend closing it at the end of your try block, line 67. -Michael*/

        //creating a breaking point in the input if the person does not answer no or yes
        System.out.println("Type the word 'done' when the question is answered: ");
                /*this is a seriously impressive number of comments -Michael*/
        //Creating a question for the person to answer using the input
        System.out.println("Do you want to save your game data so far? Type Yes or No: ");

        //Creating a true boolean to break the code if yes, no, or done is typed into the console
         while (true){
            String inputString = scan.nextLine();
            //creating a command for "done" as told to type in the printed line above
            if (inputString.equalsIgnoreCase("done")) {
                break;
    
            }
            //if the answer is yes, it will save the game data
            if (inputString.equalsIgnoreCase("Yes")) {
                System.out.println("'Game data saved'");/*It is funny to me that it dosen't actually matter what you tell the program yet, it still does the same thing. I have a couple fake choices like that in some of my other projects. -Michael*/
        }
        //if the answer is no to saving the game, it will print out no save data 
        if (inputString.equalsIgnoreCase("No")) {
            System.out.println("'No game data saved'");
        }
    
    System.out.println("Would you like to load your saved data? Type Yes or No: ");

    scan.nextLine();

        //creating a command for "done" as told to type in the printed line above
        if (inputString.equalsIgnoreCase("done")) {
            break;

        }
        //if the answer is yes, it will load the saved game
        if (inputString.equalsIgnoreCase("Yes")) {
            System.out.println("'Loading saved data...'");
    }
    //if the answer is no to saving the game, it will create a new game
    if (inputString.equalsIgnoreCase("No")) {
        System.out.println("'Creating a new game...'");
    }

    //catching a possible exceptionininitializererror 
}
    }catch (ExceptionInInitializerError e){
        e.printStackTrace();/*I am amazed by how many ways there are to do one thing in java. I didn't know you could print errors this way. -Michael*/
    }
}
}
