import java.util.Scanner;
/*
public class main {

}
*/
//Michael Rollins darthsharkmike@gmail.com

//for CTE software development 1

//instructor Mr Gross

public class manyhorses {
    public static void main(String[] args) {
        Horse h1 = new Horse("Calf", 2022);
        Horse h2 = new Horse("Mare", 2121);
        Horse h3 = new Horse("Stallion", 203);
        System.out.print(h1.name + " " + h1.birthYear + ", " + h2.name + " " + h2.birthYear + ", " + h3.name + " " + h3.birthYear + ".");
    }  
};

class test {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {

            System.out.println("What is your name?");
            String name = keyboard.next();

            System.out.println("Hello " + name + ". Please finish the following sentence.");
            System.out.print("My favorite game is ");
            String game = keyboard.next();
            System.out.println( );

            if(game=="Minecraft") {
                System.out.println("Awsome! Would you like to play Minecraft?");
            }
            else if(game=="RPG") {
                System.out.println("Well, I can get that set up for you, if you would like that.");

            }
            else {
                System.out.println("I don't have that game available. Sorry! Come back anouther time.");
                System.out.println(game);
            }
        };
    };
};