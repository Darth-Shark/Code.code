//
//
import java.util.*;

public class DataStructures {
    String c1; String c2; String c3; String c4; String c5;
    String top;
    int size = 0;
    String bottom;//This one isn't really necesarry. It is always equal to c1.

    public DataStructures() {}
    public String peek() {
        return bottom;
    }
    public void add(String String) {
        switch (size) {//simple switch
            case 1: c2 = String; break;
            case 2: c3 = String; break;
            case 3: c4 = String; break;
            case 4: c5 = String; break;
            case 0: c1 = String; bottom = String; break;
            default: size--; String = top; break;
        }
        top = String;
        size++;
    }
    public String pop() {
        String returns = top;
        switch (size) {
            case 1: top = null; c1 = null; break;
            case 2: top = c1; c2 = null; break;
            case 3: top = c2; c3 = null; break;
            case 4: top = c3; c4 = null; break;
            case 5: top = c4; c5 = null; break;
            default: size++; break;
        }
        size--;
        return returns;
    }
    public String unqueue(){
        String returns = bottom;
        if (size==0) {
            size++;
        }
        c1 = c2; c2 = c3; c3 = c4; c4 = c5; c5 = null; //This is a very simple way to do this. 
        //I tried some compliated thing to determine what the next bottom was, by why would I need to?
        //I don't need to change the value of top. It is still on top.
        bottom = c1;
        size--;
        return returns;
    }


    public static void main(String args[]){
        DataStructures data =  new DataStructures();
        Scanner scan = new Scanner(System.in);
        System.out.println("This program functions as both a stack and a queue.");//Brecause why not.
        System.out.println("Valid commands are as follows.");
        System.out.println("pop, unqueue, add, peek, size, exit, help");//And a few easter eggs. See above comment.
        while(true) {//First half.
            System.out.println();
            String input = scan.next();
            input = input.trim();//Simplifies inputs.
            input = input.toLowerCase();
            if(input.equals("pop")) {
                String string = data.pop();
                System.out.println(string);
            } else if(input.equals("unqueue")||input.equals("unq")) {//Because 'unqueue' is kindof long.
                String string = data.unqueue();
                System.out.println(string);
            } else if(input.equals("add")) {
                System.out.print("Type a string: ");
                String string = new String(scan.next());//A list of strings is a very simple one.
                data.add(string);
            } else if(input.equals("peek")) {
                String string = data.peek();
                System.out.println(string);
            } else if(input.equals("size")) {
                System.out.println(data.size);
            } else if(input.equals("exit")) {
                break;
            } else if(input.equals("help")) {
                System.out.println("Valid commands are as follows.");//More info.
                System.out.println("pop, unqueue, add, peek, size, exit, and help.");
                System.out.println("Pop removes the newest string and outputs it.");
                System.out.println("Unqueue (unq also works) removes the oldest string and outputs it");
                System.out.println("Add adds your next string to the structure.");
                System.out.println("Peek outputs the oldest input string without removing it.");
                System.out.println("Size returns the number of stored strings.");
                System.out.println("Help shows this message.");
                System.out.println("Exit exits the program.");//Runs the second half, then exits.
            } else if(input.equals("who let the dogs out?")) {//fun stuff.
                System.out.println("Who?");
                System.out.println("Who?");
                System.out.println("Who?");
                System.out.println("Who?");
            } else if(input.equals("Open sesame.")) {
                System.out.println("When one sesame closes, anouther one opens.");
            } else if(input.equals("My name is Inigo Montoya.")) {//Easter eggs
                System.out.println("Stop saying that!");
            } else {
                System.out.println("Uknown command. Try typing 'help'.");//Error message, basically.
            }
        }
        while (true) {//Second half.
            System.out.println();
            System.out.println("So you've messed with stacks and queues a bit.");//Probably.
            System.out.println("Dosen't seem like something with many real-world applications.");
            System.out.println("But, can I show you something? (y/n)");//Note the use of 'can' not 'may'
            scan.next();//Breaks up the text to make it easier to read.
            System.out.println("You don't actually have a choice.");//Muhaha!
            Card c1 = new Card(1, 3); Card c2 = new Card(2, 2); Card c3 = new Card(8, 0); Card c4 = new Card(11, 1);
            //Conviniently reusing the card object.
            System.out.println("Say I have a deck with the following cards. " + c1.name() + ", " + c2.name() +  ", " + c3.name() +  ", " + c4.name() + ".");
            System.out.println("If I lay them facedown ontop of eachother in the listed order.");//I feel like this is a decent explanation.
            System.out.println("Then I have a group of cards. Do you follow me? (y/n)");
            scan.next();//You have no choice.
            System.out.println("So, if I take the top card off repeatedly, it's like a stack structure.");
            System.out.println("First in, last out, so I get this order. " + c4.name() + ", " + c3.name() +  ", " + c2.name() +  ", " + c1.name() + ".");
            //I don't need to simulate a stack, I already know what it will output.
            System.out.println("But if I draw the cards off the bottom, it's a queue.");//Of course, you can take the cards out in any order you like.
            System.out.println("First in, first out, giving me this order. " + c1.name() + ", " + c2.name() +  ", " + c3.name() +  ", " + c4.name() + ".");
            System.out.println("Does that make sense?");
            scan.next();//I hope the user feels engaged.
            System.out.println("Well, thanks for running this program.");
            break;//The while loop just makes this section easier to read.
        }
        scan.close();//close source leaks.
        data.peek();
    }
}