//katelynn.graham@malad.us
//Card Project Continued
//Dealer class
//December 7, 2023
//Software and Programming dev
//Mr Gross
//Added debugging code and etc.
//By Katelynn Graham
//For Software and Programming Dev 11B
//Final Project Edits for Semester 2
//May 8, 2024

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class Dealer {
    //creating the parameters for the class
    static Deck deckInUse;
    static int player1Score=0;
    static int player2Score=0;
    static int player3Score=0;
    static int player4Score=0;
    static int player5Score=0;

//creating the deck and all 5 players
public static void main (String[] args){

    //DEBUGGER
        boolean deBug = true;
        boolean deBugger = false;
        int debug1 = 1;
        boolean debugs = true;
        

    try {    
        //creating a debugger that switches on and off
    if (deBug) {

        //Added breakpoint
        System.out.println("Debugging is off");
    }
     if (deBugger) {

        System.out.println("Debugging is on and the imporant varibles are bcd");
     }
        //some output of the debugger if it is on
        if (debug1==1){
            //+added breakpoint
    System.out.println(deBugger);
     }
    else{ 
        //+added breakpoint
        System.out.println(debug1);
   
        
    }



    //new deck
    deckInUse=new Deck();
    //making the 5 players
    ArrayList<Card> player1=new ArrayList<Card>();
    ArrayList<Card> player2=new ArrayList<Card>();
    ArrayList<Card> player3=new ArrayList<Card>();
    ArrayList<Card> player4=new ArrayList<Card>();
    ArrayList<Card> player5=new ArrayList<Card>();
    //shuffle the new deck
    deckInUse.DeckShuffle();
    //deal the next card to player 1
    for (int x=0;x<6;x++){
        if (deckInUse.isNextCard()){
            player1.add(deckInUse.dealNextCard());
        }

  //deal the next card to player 2

        if (deckInUse.isNextCard()){
            player2.add(deckInUse.dealNextCard());
        }

    //deal the next card to player 3


        if (deckInUse.isNextCard()){
            player3.add(deckInUse.dealNextCard());
        }

    //deal the next card to player 4


        if (deckInUse.isNextCard()){
            player4.add(deckInUse.dealNextCard());
        }

    //deal the next card to player 5


        if (deckInUse.isNextCard()){
            player5.add(deckInUse.dealNextCard());
        }
    }
        //print out player 1's hand and get the value of their cards
        System.out.println("player1's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player1.get(x));
            player1Score=player1Score+player1.get(x).getCardValue();
        }

        //Debugging statement
        if (debugs == true){
        System.out.println(String.format("Debugging: The value of score is player1+player1score", player1Score));
        }
        //print out player 2's hand and get the value of their cards
         System.out.println("player2's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player2.get(x));
            player2Score=player2Score+player2.get(x).getCardValue();
            
        }
        //Debugging Statement
        if (debugs == true){
        System.out.println(String.format("Debugging: The value of score is player2+player2score", player2Score));
        }
        //print out player 3's hand and get the value of their cards
         System.out.println("player3's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player3.get(x));
            player3Score=player3Score+player3.get(x).getCardValue();
            
        }
        //Debugging Statement
        if (debugs == true){
        System.out.println(String.format("Debugging: The value of score is player3+player23score", player3Score));
        }
        //print out player 4's hand and get the value of their cards
         System.out.println("player4's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player4.get(x));
            player4Score=player4Score+player4.get(x).getCardValue();
        }

         //Debugging Statement
         if (debugs == true){
         System.out.println(String.format("Debugging: The value of score is player4+player4score", player4Score));
         }
        //print out player 5's hand and get the value of their cards
        System.out.println("player5's hand is");
        for (int x=0; x<6;x++){
            System.out.println(player5.get(x));
            player5Score=player5Score+player5.get(x).getCardValue();
            
        }
         //Debugging Statement
         if (debugs == true){
         System.out.println(String.format("Debugging: The value of score is player5+player5score", player5Score));
         }
  //Reading from the file 
String filePath = "userinputgame.txt"; {

try {

        //Making the scanner that will read from userinputgame.txt
        Scanner scan = new Scanner(new File(filePath));

        // for method for reading from the file with the scanner
        for (int x = 0; x<4; x++){
            //Reads from the input information in the file 5 times
            String userName = scan.nextLine();
             String playerNum = scan.nextLine();
             String playerWins = scan.nextLine();
             String gamesPlayed = scan.nextLine();

             //Prints out all of the information into the file with their own lines
             System.out.println(filePath);               
        }
        
        //Closing the scanner
        scan.close();

        //Catching the filenotfoundexception
      } catch (FileNotFoundException e) {
        e.printStackTrace();  
     }
}


    //If player1's score is greater than players 2-5 score, player1 beats players 2-5

    if (player1Score>player2Score){
    System.out.println("Player1 beats Player2");
    }
    if (player1Score>player3Score){
        System.out.println("Player1 beats Player3");
    }
    if (player1Score>player4Score){
        System.out.println("Player1 beats Player4");
    }
    if (player1Score>player5Score){
        System.out.println("Player1 beats Player5");
    }

        //If player2's score is greater than players 3-5 score, player2 beats players 3-5
    if (player2Score>player3Score){
        System.out.println("Player2 beats Player3");
    }
    if (player2Score>player4Score){
        System.out.println("Player2 beats Player4");
    }
    if (player2Score>player5Score){
        System.out.println("Player2 beats Player5");
    }

        //If player3's score is greater than players 4-5 score, player3 beats players 4-5

    if (player3Score>player4Score){
        System.out.println("Player3 beats Player4");
    }
    if (player3Score>player5Score){
        System.out.println("Player3 beats Player5");
    }

    //If player4's score is greater than players 5 score, player4 beats players 5

    if (player4Score>player5Score){
        System.out.println("Player4 beats Player5");
    }     

      
    }catch (ExceptionInInitializerError e){
        e.printStackTrace();
    }
    
}       
 }
    
