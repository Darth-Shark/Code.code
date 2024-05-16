//katelynn.graham@malad.us
//Katelynn Graham
// Software and Programming Development 11A
//Cards Project inherited class and Deck class
//December 1, 2023
//Any added code by Katelynn Graham
//For Kim Gross
//Software and Programming Developement 11B
//May 8th, 2024

import java.util.ArrayList;
import java.util.Collection;/*this import is unused -Michael*/
import java.util.Collections;

public class Deck{
    
// Creating the arraylist of cards in the deck
    ArrayList<Card> cardsInDeck;
    //Creating the parameters of the arraylist
   int nextCard;
   int totalNumberOfCardsInDeck=52;

   public Deck (){
    cardsInDeck = new ArrayList <Card>();

    /*The code below is very bulky, maybe you could use loops to trim it a bit? Brute forcing works, but it's easier to make mistakes when copypasting huge code blocks like that. I would know. -Michael*/
    
//create the cards

//Creating the 13 cards in the Spades suit
//Adding the Values of each card
//Ace = 13 and 2 = 1
    Card cardInfo1 = new Card(0,"Spades","Ace", 13);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","King", 12);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","Queen", 11);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","Jack", 10);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","10", 9);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","9", 8);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","8", 7);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","7", 6);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","6", 5);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","5", 4);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","4", 3);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","3", 2);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Spades","2", 1);
    //2's value is equivalent to 1
    cardsInDeck.add (cardInfo1);

//Creating the 13 cards in the Hearts suit
//Adding the Values of each card
//Ace = 13 and 2 = 1

    cardInfo1 = new Card(0,"Hearts","Ace", 13);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","King", 12);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","Queen", 11);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","Jack", 10);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","10", 9);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","9", 8);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","8", 7);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","7", 6);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","6", 5);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","5", 4);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","4", 3);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","3", 2);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Hearts","2", 1);
    //card 2's value is equivalent to 1
    cardsInDeck.add (cardInfo1);

//Creating the 13 cards in the Diamonds suit
//Adding their card values
//Ace = 10, 2 = 1

    cardInfo1 = new Card(0,"Diamonds","Ace", 13);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","King", 12);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","Queen", 11);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","Jack", 10);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","10", 9);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","9", 8);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","8", 7);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","7", 6);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","6", 5);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","5", 4);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","4", 3);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Diamonds","3", 2);
    cardsInDeck.add (cardInfo1);
//card 2's value is equivalent to 1
    cardInfo1 = new Card(0,"Diamonds","2", 1);
    cardsInDeck.add (cardInfo1);

    //Creating the 13 cards in the Clubs suit
    //Adding their card values
    //Ace = 13, 2 = 1

    cardInfo1 = new Card(0,"Clubs","Ace", 13);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","King", 12);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubd","Queen", 11);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","Jack", 10);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","10", 9);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","9", 8);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","8", 7);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","7", 6);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","6", 5);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","5", 4);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","4", 3);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","3", 2);
    cardsInDeck.add (cardInfo1);
    cardInfo1 = new Card(0,"Clubs","2", 1);
    //card 2's value is equivalent to 1
    cardsInDeck.add (cardInfo1);
    nextCard=0;
}
//To shuffle the deck
public void DeckShuffle(){
    Collections.shuffle(cardsInDeck);/*You are using the collection import here, but it regesters as unused above, am I misunderstanding something? -Michael*/
    nextCard=0;
}
//To deal the next card from the top of the stack
public Card dealNextCard(){
return cardsInDeck.get(nextCard++);
}
//To check to see if there is a next card or if the deck is gone
public boolean isNextCard(){
    if (nextCard<=cardsInDeck.size()) {
        return true;
    }
    return false;
    }
}