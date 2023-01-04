import java.util.ArrayList;
import java.util.Random;

//Playing card class created by Michael Rollins
//for CTE Software Development class 2022
//Thanks to Mr. Kim Gross for help with trouble shooting.

public class Card {
    int value;//1 for an ace, 2 for a two, 3 dor a three, etc... 11 for a jack, 12 for a queen, 13 for a king.
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
        Card test = new Card(11, 0);
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
};
class PlayerDeck extends Deck{
    ArrayList<Card> HandList1=new ArrayList<Card>();
    ArrayList<Card> HandList2=new ArrayList<Card>();
    ArrayList<Card> HandList3=new ArrayList<Card>();
    ArrayList<Card> HandList4=new ArrayList<Card>();
    ArrayList<Card> HandList5=new ArrayList<Card>();
    int id;
    String handString;
    PlayerDeck(int idInt){
        id = idInt;
    };
    public void add(int value, String suit){
        switch(id){//I can't figure out a better way to do this. You can't create an array from a variable apparently.
            case 1: HandList1.add(new Card(value,suit));
            break;
            case 2: HandList2.add(new Card(value,suit));
            break;
            case 3: HandList3.add(new Card(value,suit));
            break;
            case 4: HandList4.add(new Card(value,suit));
            break;
            case 5: HandList5.add(new Card(value,suit));
            break;
            default: System.out.println("The id of this players hand is invalid. Id = " + id);//error message
            break;
        };
    };
    public void getHandString(){
        System.out.println("The hand of Player " + id);//an afterthought
        switch(id){//Outputting the contents of a hand.
            case 1: for(Card cd:HandList1){
                cd.name();
                System.out.println(cd.name);
            };
            break;
            case 2: for(Card cd:HandList2){
                cd.name();
                System.out.println(cd.name);
            };
            break;
            case 3: for(Card cd:HandList3){
                cd.name();
                System.out.println(cd.name);
            };
            break;
            case 4: for(Card cd:HandList4){
                cd.name();
                System.out.println(cd.name);
            };
            break;
            case 5: for(Card cd:HandList5){
                cd.name();
                System.out.println(cd.name);
            };
            break;
            default: System.out.println("The id of this players hand is invalid. Id = " + id);//error message
            break;
        };
        System.out.println();
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
        p1.getHandString();
        p2.getHandString();
        p3.getHandString();
        p4.getHandString();
        p5.getHandString();
    };
};
class tryHand{
    public static void main(String args[]){
        Deck deck = new Deck();
//        PlayerDeck p1 = new PlayerDeck(1);
        deck.readout();
        new Card(1, 1); 
    };
}
class tryDeck{
    public static void main(String args[]){//testing the 'deck' class.
        Deck deck = new Deck();
        deck.readout();
    };
};
