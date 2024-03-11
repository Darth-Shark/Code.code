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
            try {  //(Scanner scan = new Scanner(System.in);) {Is loading the scanner here better? It dosen't fix the line not found exceptions.

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
        try (Scanner scan = new Scanner(System.in)) {
            String name = new String("MissingNo");
            String type = new String("null");
            String s = new String();
            int pwr = 5;//Initializing stuffs. Adding default data.
            int hp = 20;            
           
            System.out.println("Please insert the name of your dragon.");
            name = scan.nextLine();
            name = name.trim();//So I don't get the name "   Bob".

            System.out.println("Please insert the breath weapon of your dragon.");
            System.out.println("Valid breath weapons are as follows:");
            System.out.println("Fire, ice, dark, green fire, blue fire, frost, hoarfrost, and purple fire.");//A long list. Each of the different fire colors are the same, but all the other things are different.
            System.out.println("Inserting an invalid name, or 'null', will mean your dragon uses their claws.");
            type = scan.nextLine();
            type = type.trim();
            type = type.toLowerCase();//these two lines actually aren't necesarry, the breathtype code already does this.

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
            pwr = Integer.parseInt(s);

            Dragon d1 = new DragonAggressive(name, hp, pwr);//The DragonAggressive class is an extension of the Dragon class, but it fights back. Useful here.
            d1.setBreath(type);//Because this isn't included in the original constructor. I'll fix that later.

            //Repeat above four more times
                    
            System.out.println();
            System.out.println("Please insert the name of your second dragon.");
            name = scan.nextLine();
            name = name.trim();

            System.out.println("Please insert the breath weapon of your dragon.");
            System.out.println("Fire, ice, dark, green fire, blue fire, frost, hoarfrost, or purple fire.");
            type = scan.nextLine();
            type = type.trim();
            type = type.toLowerCase();

            System.out.println("How much health does your dragon have? Please insert an integer.");
            s = scan.nextLine();
            s = s.trim();
            hp = Integer.parseInt(s);
                
            System.out.println("How powerful is your dragon? Please insert an integer.");
            s = scan.nextLine();
            s = s.trim();
            pwr = Integer.parseInt(s);

            Dragon d2 = new DragonAggressive(name, hp, pwr);//This looks weird to me.
            d2.setBreath(type);


            System.out.println();
            System.out.println("Please insert the name of your third dragon.");
            name = scan.nextLine();
            name = name.trim();
            
            System.out.println("Please insert the breath weapon of your dragon.");
            System.out.println("Fire, ice, dark, green fire, blue fire, frost, hoarfrost, or purple fire.");
            type = scan.nextLine();
            type = type.trim();
            type = type.toLowerCase();

            System.out.println("How much health does your dragon have? Please insert an integer.");
            s = scan.nextLine();
            s = s.trim();
            hp = Integer.parseInt(s);
                
            System.out.println("How powerful is your dragon? Please insert an integer.");
            s = scan.nextLine();
            s = s.trim();
            pwr = Integer.parseInt(s);

            Dragon d3 = new DragonAggressive(name, hp, pwr);
            d3.setBreath(type);


            System.out.println();
            System.out.println("Please insert the name of your fourth dragon.");
            name = scan.nextLine();
            name = name.trim();
            
            System.out.println("Please insert the breath weapon of your dragon.");
            System.out.println("Fire, ice, dark, green fire, blue fire, frost, hoarfrost, or purple fire.");
            type = scan.nextLine();
            type = type.trim();
            type = type.toLowerCase();

            System.out.println("How much health does your dragon have? Please insert an integer.");
            s = scan.nextLine();
            s = s.trim();
            hp = Integer.parseInt(s);
                
            System.out.println("How powerful is your dragon? Please insert an integer.");
            s = scan.nextLine();
            s = s.trim();
            pwr = Integer.parseInt(s);

            Dragon d4 = new DragonAggressive(name, hp, pwr);
            d4.setBreath(type);


            System.out.println();
            System.out.println("Please insert the name of your fifth dragon.");
            name = scan.nextLine();
            name = name.trim();
            
            System.out.println("Please insert the breath weapon of your dragon.");
            System.out.println("Fire, ice, dark, green fire, blue fire, frost, hoarfrost, or purple fire.");
            type = scan.nextLine();
            type = type.trim();
            type = type.toLowerCase();

            System.out.println("How much health does your dragon have? Please insert an integer.");
            s = scan.nextLine();
            s = s.trim();
            hp = Integer.parseInt(s);
                
            System.out.println("How powerful is your dragon? Please insert an integer.");
            s = scan.nextLine();
            s = s.trim();
            pwr = Integer.parseInt(s);

            Dragon d5 = new DragonAggressive(name, hp, pwr);
            d5.setBreath(type);


            System.out.println();
            System.out.println("You have created five dragons!");
            System.out.println();
            System.out.println("The dragons decide to hold a tournament.");
            d1.breathe(d2);
            System.out.println();
            d4.breathe(d5);
            System.out.println();
            System.out.println(d3.name+" dosen't feel like fighting.");
            d3.flyToggle();
            System.out.println();
            if(d1.isConsious) {//Because the user indirectly descides who wins.
                d1.flyToggle();
                if(d5.isConsious) {
                    d5.flyToggle();
                    d1.breathe(d5);
                } else if(d4.isConsious) {
                    d4.flyToggle();
                    d1.breathe(d4);
                }
            } else if(d2.isConsious) {
                d2.flyToggle();
                if(d5.isConsious) {
                    d5.flyToggle();
                    d2.breathe(d5);
                } else if(d4.isConsious) {
                    d4.flyToggle();
                    d2.breathe(d4);
                }
            }
            System.out.println();
            System.out.println("Simulation completed. Thank you.");
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("That wasn't an integer!");
            System.out.println("An integer is a number without a decimal.");
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
    }
};
