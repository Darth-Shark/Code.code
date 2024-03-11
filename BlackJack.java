import java.util.Random;//Various imports.
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
//Extension of the Card class involving user input.
//CTE Software Development 2, 2024


public class BlackJack {
    public static void main(String args[]){
        Deck deck = new Deck();
        PlayerDeck house = new PlayerDeck(2);
        PlayerDeck user = new PlayerDeck(1);
        Boolean playing = true;
        Boolean playersTurn = true;
        Boolean hasStood = false;
        Boolean hasQuit = false;
        String input = new String();
        int error = 1;
        user.clear();
        house.clear();

        System.out.println("Welcome to black jack! The rules are simple.");
        System.out.println("You, player "+ error + ", will draw a hand of cards.");//The ramdom int in there is to prevent a source leak. Kinda random.
        System.out.println("I will control your opponent, player 2.");
        System.out.println("I assume you know how to play black jack, so we will start by each drawing two cards.");
        deck.draw(user);
        deck.draw(user);
        deck.draw(house);
        deck.draw(house);
        Scanner scan = new Scanner(System.in);
        
        while (hasQuit == false) {
            while (playing==true){
                try {//The order of these while and try blocks is rather important.
                    while (hasStood == false && playersTurn == true) {//The player's turn.
                        System.out.println();
                        user.getValue();
                        System.out.println("Here is your current hand.");
                        user.readout();
                        System.out.println("The total of your hand is " + user.value);
                        System.out.println();

                        System.out.println("Would you like to...");
                        System.out.println("A: Draw anouther card.");
                        System.out.println("B: Stand with your current cards.");//Instructions.
                        System.out.println("C: End the program.");

                        try {
                            while (true){
                                if (scan.hasNext()) {
                                    input = scan.next();
                                    break;
                                }
                            }
                            System.out.println();
                            input = input.trim();//For consistent inputs.
                            input = input.toLowerCase();

                            if (input.equals("a")) {//Comparing strings is not the same as comparing other things.
                                System.out.println("Drawing a new card...");
                                deck.draw(user);
                                user.getValue();
                                if (user.value>=21) {
                                    user.readout();
                                    System.out.println("You busted!");
                                    System.out.println();
                                    playing = false;
                                };
                                playersTurn = false;
                            } else if (input.equals("b")) {
                                System.out.println("You stand with a hand of " + user.value);
                                playersTurn = false;//Probably not nescesary.
                                hasStood = true;//Loops are fun!
                            } else if (input.equals("c")) {
                                System.out.println("Very well, thanks for playing!");
                                hasQuit = true;
                                error = 1/0;//Immediately exits the try loop.
                            } else {
                                System.out.println("I don't recognise that command!");//Error handling.
                            }
                        } catch (InputMismatchException e) {
//                            System.out.println(e);//This probably won't matter.
                            System.out.println("Sorry! I didn't understand that.");
                        } catch (NoSuchElementException e) {
                            System.out.println(e);
                        };
                    };
                    System.out.println();
                    if (user.getValue()>=21) {
                        System.out.println("You busted!");
                        playing = false;
                        error = 1/0;//Immediately exits the try loop.
                    };


                    house.getValue();
                    if (house.value>=21) {//House AI.
                        //Busts are handled further down.
                    } else if (house.value>=18) {
                        System.out.println("I'll stand.");
                        if (hasStood = true) {//If both players have stood.
                            playing = false;
                            error = 1/0;
                        }
                    } else {
                        System.out.print("I'll take a card... ");
                        deck.draw(house);
                    };

                    house.getValue();
                    if (house.value>=21) {
                        System.out.println("I busted!");//Ouch!
                        playing = false;
                    } else if (hasStood==false) {
                        System.out.println("Your turn!");
                        playersTurn = true;
                    } else {
                        System.out.println("My turn continues because you have stood.");//Simple message.
                    }
                } catch (ArithmeticException e) {
                    playing = false;
                }//I throw an error on purpose to exit the loop faster. Probably could just use a break.
            }
            if (hasQuit == false) {
                System.out.println();
                System.out.print("This was my hand: ");
                house.readout();
                System.out.println();
                user.getValue();
                house.getValue();
                if (user.value>=21) {
                    if (house.value>=21) {
                        System.out.println("We both busted, a tie!");//I don't think this can actually happen.
                    } else {
                        System.out.println("You busted, I won!");
                    }
                } else if (house.value>=21) {
                    System.out.println("I busted, you won!");
                } else if (house.value>=user.value) {
                    System.out.println("My hand was higher, I won!");
                } else if (house.value<=user.value) {
                    System.out.println("Your hand was higher, you won!");
                } else {
                    System.out.println("Our hands are equal, a tie!");
                }
                System.out.println("My hand: " + house.value + ". Your hand " + user.value + ".");
                playersTurn = true;//Because the program is waiting for user input.
                while (true){
                    System.out.println("Play again? Y/N");
                    try {
                        while (true){
                            if (scan.hasNext()) {
                                input = scan.next();
                                break;
                            }
                        }
                        input = input.trim();
                        input = input.toLowerCase();
                        if (input.equals("y")) {
                            deck.reset();
                            user.clear();
                            house.clear();

                            System.out.print("Okay! I'll ramdomly descide who goes first...");

                            Random rand = new Random();
                            if (rand.nextInt(1) == 0) {
                                playersTurn = true;
                                System.out.print("You are first!");
                            } else {
                                System.out.print("I'm first!");
                            }
                            playing = true;
                            hasStood = false;
                            break;
                        } else if (input.equals("n")) {
                            System.out.println("Very well, thanks for playing!");
                            hasQuit = true;
                            break;
                        } else {
                            System.out.println("Sorry! I didn't understand that.");
                        }
                    } catch (NoSuchElementException e) {
                        System.out.println(e);
                        break;
                    }
                }
            }
        }
        scan.close();
    }
}
