//implementation of the dragon class created by Michael Rollins
//CTE Software Development 2, 2024
//so converting from string to int is less risky
import java.util.*; //scanner class, converting String to int. Also exception handling.


public class buildYourDragon {
    String name = new String("MissingNo");
    String type = new String("null");
    int pwr = 5;//Initializing stuffs. Adding default data.
    int hp = 20;
    public buildYourDragon(String name, String type, int pwr, int hp) {}

    public void makeDragon(String name, String type, int pwr, int hp) {
        String s = new String();
        boolean isDone = false;
        Scanner scan = new Scanner(System.in);
        while(isDone==false){
            try/*(Scanner scan = new Scanner(System.in);)*/ {//Is loading the scanner here better? It dosen't fix the line not found exceptions.

                System.out.println("Please insert the name of your dragon.");
                this.name = scan.nextLine();
                this.name = this.name.trim();//So I don't get the name "   Bob".

                System.out.println("Please insert the breath weapon of your dragon.");
                System.out.println("Valid breath weapons are as follows:");
                System.out.println("Fire, ice, dark, green fire, blue fire, frost, hoarfrost, and purple fire.");//A long list. Each of the different fire colors are the same, but all the other things are different.
                System.out.println("Inserting an invalid name, or 'null', will mean your dragon uses their claws.");
                this.type = scan.nextLine();
                this.type = this.type.trim();
                this.type = this.type.toLowerCase();//these two lines actually aren't necesarry, the breathtype code already does this.

                System.out.println("How much health does your dragon have? Please insert an integer.");
                System.out.println("Note: numbers smaller than 200 are recommended.");//Using a larger number make for very long battles.
                s = scan.nextLine();
                s = s.trim();
                hp = Integer.parseInt(s);
                
                System.out.println("How powerful is your dragon? Please insert an integer.");
                System.out.println("Note: numbers smaller than 30 are recommended.");//My combat system kindof breaks down if this number is too large.
                System.out.println("if it's power is less than 15, it might not be able to use all breath weapons.");//Full disclosure. I anticipate user frustration if this is removed.
                s = scan.nextLine();
                s = s.trim();
                this.pwr = Integer.parseInt(s);
                
                isDone = true;//This line will only run if there were no InputMismatchExceptions.
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("That wasn't an integer!");
                System.out.println("An integer is a number without a decimal.");
            } catch (NoSuchElementException e) {
                System.out.println(e);
                break;//So my code dosen't loop forever.
            }
        }
        scan.close();//Fixing a source leak.
    };
    public static void main(String[] args) {
        buildYourDragon This = new buildYourDragon("MissingNo", "null", 5, 20);
        //Using an object to create the dragons mean I don't have to copy and paste my whole code five times.
        
        This.makeDragon(This.name, This.type, This.pwr, This.hp);//See above makeDragon function for comments.
        Dragon d1 = new DragonAggressive(This.name, This.hp, This.pwr);//The DragonAggressive class is an extension of the Dragon class, but it fights back. Useful here.
        d1.setBreath(This.type);//Because this isn't included in the original constructor. I'll fix that later.

        //Repeat above four more times
                
        This.makeDragon(This.name, This.type, This.pwr, This.hp);
        Dragon d2 = new DragonAggressive(This.name, This.hp, This.pwr);//This looks weird to me.
        d2.setBreath(This.type);

        This.makeDragon(This.name, This.type, This.pwr, This.hp);
        Dragon d3 = new DragonAggressive(This.name, This.hp, This.pwr);
        d3.setBreath(This.type);

        This.makeDragon(This.name, This.type, This.pwr, This.hp);
        Dragon d4 = new DragonAggressive(This.name, This.hp, This.pwr);
        d4.setBreath(This.type);

        This.makeDragon(This.name, This.type, This.pwr, This.hp);
        Dragon d5 = new DragonAggressive(This.name, This.hp, This.pwr);
        d5.setBreath(This.type);

        System.out.println("You have created five dragons!");
        System.out.println("The dragons decide to hold a tournament.");
        d1.breathe(d2);
        d4.breathe(d5);
        System.out.println(d3.name+" dosen't feel like fighting.");
        d3.flyToggle();
        if(d1.isConsious) {//Because the user indirectly descides who wins.
            if(d3.isConsious) {
                d1.breathe(d3);
            } else if(d4.isConsious) {
                d1.breathe(d4);
            }
        } else if(d2.isConsious) {
            if(d3.isConsious) {
                d2.breathe(d3);
            } else if(d4.isConsious) {
                d2.breathe(d4);
            }
        }
    }
};
