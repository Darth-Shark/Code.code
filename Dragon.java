//More complex dragon class created by Michael Rollins
//for CTE Software Development class 2022

public class Dragon {
    String name;//Name of dragon.
    String breathType;//Breath weapon type of dragon.
    int maxHealth;//Max health of dragon.
    int health;//Current health of dragon.
    int attackPwr;//Stregnth of dragon.
    boolean isFlying;//Whether the dragon is activly flying or not.
    boolean isConsious;//Has the dragon been defeated in combat?
    int dmg;//For breath weapon. Used to stor working damage amount.


    //Methods to create dragon and change it's states.
    public Dragon(String dragonName, int maxHealthAmount, int pwr){//defining various dragon stats.
        name=dragonName;
        maxHealth=maxHealthAmount;
        attackPwr=pwr;
        health=maxHealth;
        isConsious=true;
        isFlying=false;
        System.out.println("Created new dragon, " + name + ".");
    };
    public void setBreath(String newBreath){//Method to change breat weapon type.
        if(newBreath=="fire" || newBreath=="ice" || newBreath=="dark" || newBreath=="green fire" || newBreath=="blue" || newBreath=="frost"){
            breathType=newBreath;
            System.out.println(name + "'s breath type succesfully set to " + newBreath + "!");
        }
        else if(newBreath=="null"){
            breathType=newBreath;
            System.out.println(name + " does not have a breath wepon.");
        }
        else{
            System.out.println(newBreath + " is an invalid attack type.");
        };//What is a more efficient way to do this? I want more valid breath types than just 'fire'.
    }; 
    public void attackUp(int pwrIncrement){//Method to increase attack damage.
        attackPwr=attackPwr+pwrIncrement;
        System.out.println(name + "'s attack power changed to " + attackPwr + "!");
    };

    
public void flyToggle(){//Toggles boolean isFlying.
    if(isConsious==false){
        System.out.println(name + " is uncounsious and cannot fly.");//Error messsage.
    }
    else if(isFlying==true){
        isFlying=false;
        System.out.println(name + " comes in to land.");
    }
    else{
        isFlying=true;
        System.out.println(name + " takes to the sky.");
    };
};
    public void breathe(){// Funtion for breath attack. Returns attack type and damage.
        if(isConsious==false){
            System.out.println(name + " is unconcious and can't attack!");
            dmg = 0;//prevent unconsious dragons from dealing damage.
        }
        else if(breathType=="fire" || breathType=="green fire" || breathType=="blue fire"){
            System.out.println(name + " breathes " + breathType + " at their opponents!");
            dmg = attackPwr + attackPwr;
        }
        else if(breathType=="ice" || breathType=="frost"){
            System.out.println(name + " chills the enemy with their " + breathType + " breath!");
            dmg = attackPwr + 10;
        }
        else if(breathType=="dark"){
            if(attackPwr > 7){
                System.out.println(name + " spews a stream of inky darkness at their opponents!");
                dmg = attackPwr + attackPwr + attackPwr - 10;
            }
            else {
                System.out.println(name + " uses their claws, as they arn't strong enough to use their breath wepon yet.");
                dmg = attackPwr;
            }
        }
        else if(breathType=="null"){
            System.out.println(name + " dosen't have a breathe weapon, so they use their claws instead!");
            dmg = attackPwr;
        }
        else{
            System.out.println(name + " dosen't have a valid breath type! They use their claws instead.");
            dmg = attackPwr;
        }
    };

    public boolean flying (){//is the dragon in the air or not?
        return isFlying;
    };
    public void damage(int damageDelt){
        if(damageDelt>=1){//Check to see is the damage delt is a valid ammount.
            health=health-damageDelt;
            if(isConsious=false){
                System.out.println(name + " has already been defeated.");
            }
            else if(health<=1){
                health=0;
                isConsious=false;//safteys
                dmg=0;
                if(isFlying==false){
                    System.out.println(name + " took " + damageDelt + " damage and was knocked uncounsious!");
                }
                else{//Added if statement for the dragon losing consioucness while flying.
                    System.out.println(name + " fell from the sky after taking " + damageDelt + " damage and being knocked uncounsious!");
                }
            }
            else{
                System.out.println(name + " took " + damageDelt + " damage and has " + health + " health remaining.");
                isConsious = true;
            };
        }
        else if(damageDelt==0){
            System.out.println(name + " is triumphant.");
        }
        else{//Error message.
            System.out.println(damageDelt + " is an invalid damage amount!");
        };
    };
};
class doDragon{
    public static void main(String[] args) {
        Dragon dFL = new Dragon("Flake", 30, 10);//create new dragons.
        Dragon dCR = new Dragon("Cris", 40, 7);
        Dragon dCH = new Dragon("Char", 25, 8);
        dFL.setBreath("fire");//set breath wepons. I should make this a part of the constructor.
        dCR.setBreath("ice");//can I have the constructor call the breath method?
        dCH.setBreath("dark");
        
        
        dCH.flyToggle();//War!
        dFL.breathe();
        dCR.damage(dFL.dmg);//This code is kindof messy. I should make a single method that gives the attacked dragon...
        dCR.breathe();//...the identity of the dragon it was attacked by, and then has it fight back automatically.
        dFL.damage(dCR.dmg);//This method should also call the breathe function.
        dFL.breathe();
        dCR.damage(dFL.dmg);
        dCR.breathe();
        dFL.damage(dCR.dmg);
        dFL.attackUp(1);
        dFL.flyToggle();
        dFL.breathe();
        dCH.damage(dFL.dmg);
        dCH.breathe();
        dFL.damage(dCH.dmg);
        dFL.breathe();
        dCH.damage(dFL.dmg);//I doubt you followed what happened there.
        dCH.attackUp(1);
        dCH.flyToggle();
    }
}
