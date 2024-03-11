import java.util.ArrayList;
import java.util.Random;

//Playing card class created by Michael Rollins
//for CTE Software Development class 2022
//Updated 3/9/2024
//Thanks to Mr. Kim Gross for help with trouble shooting.

public class Card {
    int value;//1 for an ace, 2 for a two, 3 for a three, etc... 11 for a jack, 12 for a queen, 13 for a king.
    String suit;
    String name;//I am not sure if this will work.
    public Card(int value, int suit){
        this.value = value;
        if(suit==1){
            this.suit="diamonds";
        }
        else if(suit==0){
            this.suit="spades";
        }
        else if(suit==2){
            this.suit="clubs";
        }
        else if(suit==3){
            this.suit="hearts";
        }
        else{//error message
            System.out.println(suit + " is an invalid suit number. Valid suit names are 'spades', 'diamonds', 'clubs', and 'hearts'. Their respective numbers are 0, 1, 2, and 3.");
        }
    }
    public Card(int value, String suit){
        this.value = value;
        if(suit=="spades" || suit=="diamonds" || suit=="clubs" || suit=="hearts"){
            this.suit = suit;
        }
        else{//error message
            System.out.println(suit + " is an invalid suit name. Valid suit names are 'spades', 'diamonds', 'clubs', and 'hearts'. Their respective numbers are 0, 1, 2, and 3.");
        }
    }
    public String name(){//this is so ineffeicient, but I can't think of a simpler way.
        switch(value) {
            case 1: name = "ace of " + suit;
            break;
            case 2: name = "two of " + suit; 
            break;
            case 3: name = "three of " + suit;
            break;
            case 4: name = "four of " + suit;
            break;
            case 5: name = "five of " + suit;
            break;
            case 6: name = "six of " + suit;
            break;
            case 7: name = "seven of " + suit;
            break;
            case 8: name = "eight of " + suit;
            break;
            case 9: name = "nine of " + suit;
            break;
            case 10: name = "ten of " + suit;
            break;
            case 11: name = "jack of " + suit;
            break;
            case 12: name = "queen of " + suit;
            break;
            case 13: name = "king of " + suit;
            break;
            default: name = "Error! Invalid card value. Value = " + value + ", Suit = " + suit;//error message.
            System.out.println(name);
            break;
        }
        return name;
    }
    public String getSuit(){
        return suit;
    };
    public int getValue(){
        return value;
    };
};
class tryCard{
    public static void main(String args[]){
        String n;
        Card test = new Card(2, 1);
        n = test.name();
        System.out.println("Your card is the " + n + ".");
    }
};
class Deck{
    Random rand = new Random();
    ArrayList<Card> deckList=new ArrayList<Card>();
    int value;
    int suit;
    String suitString;
    public Deck(){
        for(int s=0;s<=3;s++){
            for(int v=1;v<=13;v++){
                deckList.add(new Card(v, s));
            }
        }
    };
    public void draw(PlayerDeck pDeck){
        int rand_int1 = rand.nextInt(deckList.size());
        value = deckList.get(rand_int1).getValue();//Credit to Mr. Kim Gross for showing my how the arraylist.get method is formatted.
        suitString = deckList.get(rand_int1).getSuit();
        deckList.remove(rand_int1);
        pDeck.add(value, suitString);
    };
    public void readout(){
        for(Card cd:deckList){   
            cd.name();//added this line as a bug fix.
            System.out.println(cd.name);    
        }  
    };
    public void reset(){//Resets the deck.
        int j = deckList.size();
        while(j>=1) {
            j--;
            deckList.remove(j);
        }
        for(int s=0;s<=3;s++){
            for(int v=1;v<=13;v++){
                deckList.add(new Card(v, s));
            }
        }
    }
};
class PlayerDeck extends Deck{
    ArrayList<Card> HandList=new ArrayList<Card>();
    int id;
    int sum;
    String handString;
    int aces;
    public PlayerDeck(int idInt){
        id = idInt;
    };
    public void add(int value, String suit){
        HandList.add(new Card(value,suit));
        if (value==1) {
            aces++;
        }
    };
    public void readout(){//A function from the Deck class fullfills this purpose.
        System.out.println("The hand of Player " + id);//an afterthought
        for(Card cd:HandList){
            cd.name();
            System.out.println(cd.name);
        };
        System.out.println();
    };
    public int getValue(){
        sum = 0;
        for(Card cd:HandList){
            if (cd.value==1) {
                sum = sum + 11;
            }else if (cd.value<=10) {
                sum = sum + cd.value;
            } else {
                sum = sum + 10;
            }
        };
        if(sum>=21 && aces>=0) {
            aces--;
            sum = sum -10;
        }
        this.value = sum;
        return sum;
    };
    public void clear() {
        int j = HandList.size();
        while(j>=1) {
            j--;
            HandList.remove(j);
        }
    };
};
class playCards{
    public static void main(String args[]){
        Deck deck = new Deck();
        PlayerDeck p1 = new PlayerDeck(1);
        PlayerDeck p2 = new PlayerDeck(2);
        PlayerDeck p3 = new PlayerDeck(3);
        PlayerDeck p4 = new PlayerDeck(4);
        PlayerDeck p5 = new PlayerDeck(5);
        for(int i=0; i<5; i++){
            deck.draw(p1);
            deck.draw(p2);
            deck.draw(p3);
            deck.draw(p4);
            deck.draw(p5);
        };
        p1.readout();
        p2.readout();
        p3.readout();
        p4.readout();
        p5.readout();
    };
};
class tryHand{
    public static void main(String args[]){
        PlayerDeck p1 = new PlayerDeck(1);
        p1.add(1, "spades");
        p1.readout();
        p1.clear();
    };
};
class tryDeck{
    public static void main(String args[]){//testing the 'deck' class.
        Deck deck = new Deck();
        deck.readout();
    };
};
