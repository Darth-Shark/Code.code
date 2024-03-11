//More complex dragon class created by Michael Rollins
//for CTE Software Development class 2022
//Last updated 3/8/24
import java.util.*; //arraylists and collections

public class Dragon{
    String name;//Name of dragon.
    String breathType = "null";//Breath weapon type of dragon. 2/28/24, breath type is now "null" by default.
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
    public void setBreath(String newBreath){//Method to change breath weapon type.

        newBreath = newBreath.trim();//2/27/24 Added this line to fix potential errors
        newBreath = newBreath.toLowerCase();//Same as above.

        if(newBreath.equals("fire") || newBreath.equals("ice") || newBreath.equals("dark") || newBreath.equals("green fire") || newBreath.equals("blue fire") || newBreath.equals("frost") || newBreath.equals("hoarfrost") || newBreath.equals("purple fire")){
            breathType=newBreath;
            System.out.println(name + "'s breath type succesfully set to " + newBreath + "!");
        }
        else if(newBreath.equals("null")){
            breathType=newBreath;
            System.out.println(name + " doesn't have a breath weapon.");
        }
        else{
            System.out.println(newBreath + " is an invalid attack type.");
            breathType="null";
            System.out.println(name + " doesn't have a breath weapon.");
        };//Credit to Mr. Gross for more effective setBreath method.
    }; 
    public void setBreath(int newBreath){//Alternate version of this method, suggested by Mr. Gross.
        String [] [] breathList = {{"null","fire","blue fire","green fire","purple fire","ice","frost","hoarfrost","dark"}};//list of breath weapons.
        //if(newBreath<=breathList.length){//a neat little trick due to the first item in an array being item 0, not item 1.
        if(newBreath<=8){//trick didn't work.
            breathType = breathList[0][newBreath];
            System.out.println(name + "'s breath type succesfully set to " + breathType + "!");
        }
        else if(newBreath==0){
            breathType = breathList[0][newBreath];
            System.out.println(name + " doesn't have a breath weapon.");
        }
        else{
            System.out.println(newBreath + " is an invalid attack number.");//specified error code, to confirm you checked for a number.
            breathType = "null";
            System.out.println(name + " doesn't have a breath weapon.");
        };
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
        else if(breathType.equals("fire")){
            System.out.println(name + " breathes " + breathType + " at their opponents!");
            dmg = attackPwr + attackPwr;
        }
        else if(breathType.equals("green fire") || breathType.equals("blue fire") || breathType.equals("purple fire")){//Colered fire is a flat upgrade from normal fire, but it can't be used by weak dragons.
            if(attackPwr>=10){
                System.out.println(name + " breathes colorful " + breathType + " at their opponents!");
                dmg = attackPwr + attackPwr + 5;
            }
            else{
                System.out.println(name + " uses their claws, as they arn't strong enough to use their breath weapon yet.");
                dmg = attackPwr;
            }
        }
        else if(breathType.equals("ice")){
            System.out.println(name + " chills the enemy with their " + breathType + " breath!");
            dmg = attackPwr + 10;
        }
        else if(breathType.equals("frost")){//Frost is a more powerful version of ice, hoarfrost is another step up from that. Niether can be used by weak dragons.
            if(attackPwr>=10){
                System.out.println(name + " chills the enemy with their " + breathType + " breath!");
                dmg = attackPwr + 15;
            }
            else{
                System.out.println(name + " uses their claws, as they arn't strong enough to use their breath weapon yet.");
                dmg = attackPwr;
            }
        }
        else if(breathType.equals("hoarfrost")){
            if(attackPwr>=15){
                System.out.println(name + " chills the enemy with their " + breathType + " breath!");
                dmg = attackPwr + 20;
            }
            else{
                System.out.println(name + " uses their claws, as they arn't strong enough to use their breath weapon yet.");
                dmg = attackPwr;
            }
        }
        else if(breathType.equals("dark")){
            if(attackPwr>=7){
                System.out.println(name + " spews a stream of inky darkness at their opponents!");
                dmg = attackPwr + attackPwr + attackPwr - 10;
            }
            else {
                System.out.println(name + " uses their claws, as they arn't strong enough to use their breath weapon yet.");
                dmg = attackPwr;
            }
        }
        else if(breathType.equals("null")){
            System.out.println(name + " dosen't have a breath weapon, so they use their claws instead!");
            dmg = attackPwr;
        }
        else{
            System.out.println(name + " dosen't have a valid breath type! They use their claws instead.");
            dmg = attackPwr; //2/27/24 A code change makes this function irrelivant. I left it in for error catching purposes.
        }
    };
    public void breathe(Dragon targetDragon){
        breathe();
        targetDragon.damage(dmg, this);
    };
    public boolean flying (){//is the dragon in the air or not?
        return isFlying;
    };
    public void damage(int damageDelt){
        if(damageDelt>=1){//Check to see is the damage delt is a valid ammount.
            health=health-damageDelt;
            if(isConsious==false){
                System.out.println(name + " has already been defeated.");
            }
            else if(health<=0){
                health=0;
                isConsious=false;//saftey
                dmg=0;
                if(isFlying==false){
                    System.out.println(name + " took " + damageDelt + " damage and was knocked uncounsious!");
                }
                else{//Added if statement for the dragon losing consioucness while flying.
                    System.out.println(name + " fell from the sky after taking " + damageDelt + " damage and being knocked uncounsious!");
                    isFlying=false;
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
    public void damage(int damageDelt, Dragon sourceDragon){//In case the dragon taking damage is a basic dragon.
        damage(damageDelt);
    }
};
class doDragon{
    public static void main(String[] args) {
        Dragon dFL = new Dragon("Flake", 30, 10);//create new dragons.
        Dragon dCR = new Dragon("Cris", 40, 7);
        Dragon dCH = new Dragon("Char", 25, 8);
        dFL.setBreath("fire");//set breath weapons. I should make this a part of the constructor.
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
class DragonAggressive extends Dragon{
    public DragonAggressive(String dragonName, int maxHealthAmount, int pwr){
        super(dragonName, maxHealthAmount, pwr);//Calling the original dragon constructor.
    };

    public void damage(int damageDelt, Dragon sourceDragon){
        damage(damageDelt);
        if(isConsious==true && damageDelt>=1){
            System.out.println(name + " retaliates!");
            breathe(sourceDragon);
        };
    };
};    
class DragonPractice extends DragonAggressive{
    int XP;
    public DragonPractice(String dragonName, int maxHealthAmount, int pwr, int value){
        super(dragonName, maxHealthAmount, pwr);//Calling the original dragon constructor through the aggresive dragon constructor.
        XP = value;
    };
    public void damage(int damageDelt, Dragon sourceDragon){
        if(isConsious==false){
            System.out.println(name + " has already been defeated!");
        }else{
            damage(damageDelt);
            if(isConsious==false){//Use '==', not '='. '=' Changed the value I thought I was testing for.
                System.out.print(sourceDragon.name + " defeated a practice dragon");
                if(sourceDragon.attackPwr>=attackPwr+6){//Fair and realistic. You don't get points for beating a dragon 30 power below you. You can be at most 5 power stronger.
                    System.out.println(", but they didn't gain any atttack because they already have an attack power of " + sourceDragon.attackPwr + ".");
                }
                else{
                    System.out.println("!");
                    sourceDragon.attackUp(XP);
                }
            }
            else if(damageDelt>=1){
                System.out.println(name + " retaliates!");
                breathe(sourceDragon);
            }
        }
    };
};
class doManyDragon{
    //String [] [] breathList = {{"null","fire","blue fire","green fire","purple fire","ice","frost","hoarfrost","dark"}};
    public static void main(String[] args) {
        Dragon dDR = new Dragon("Wes",155,27);
        Dragon dFL = new DragonAggressive("Flake", 45, 7);//create new dragons.
        Dragon d1 = new DragonPractice("Null 1",25,3,3);
        Dragon d2 = new DragonPractice("Null 2",30,7,5);
        Dragon d3 = new DragonAggressive("Thane",75,7);
        dFL.setBreath("fire");//set breath weapons. I should make this a part of the constructor.
        d3.setBreath(5);

        
        System.out.println("Wes decides not to fight.");
        dDR.flyToggle();
        d3.flyToggle();//War!
        System.out.println();
        dFL.breathe(d1);
        System.out.println();
        dFL.breathe(d2);
        System.out.println();
        dFL.flyToggle();//This is WAY more consice than my previous doDragon class!
        dFL.breathe(d3);
        d3.breathe(dFL);
//        dFL.damage(dFL.dmg);
    };
};
class DragonSort extends Dragon implements Comparable<Dragon>{
    //    int pwr;
    public DragonSort(String dragonName, int maxHealthAmount, int pwr){
        super(dragonName, maxHealthAmount, pwr);//Calling the original dragon constructor.
    };
    public int compareTo(Dragon dg){    
        /*if(attackPwr==dg.attackPwr)    
        return 0;    
        else if(attackPwr>dg.attackPwr)    
        return 1;    
        else    
        return -1;*/
        return this.attackPwr - dg.attackPwr;    
    };   
};
class doSortDragon{    
    public static void main(String args[]){    
        ArrayList<DragonSort> dragonList=new ArrayList<DragonSort>();    
        dragonList.add(new DragonSort("Fes",155,21));//creates many dragons.    
        dragonList.add(new DragonSort("Gar",130,30));    
        dragonList.add(new DragonSort("Kli",95,15));
        dragonList.add(new DragonSort("Brs",340,43));    
        dragonList.add(new DragonSort("Rri",45,20));    
        dragonList.add(new DragonSort("Ser",85,7));    
        dragonList.add(new DragonSort("Brd",12,1));    
        dragonList.add(new DragonSort("Agt",120,27));    
        dragonList.add(new DragonSort("Irk",87,34));
        dragonList.add(new DragonSort("Alt",200,33));    
        dragonList.add(new DragonSort("Arr",245,23));    
        dragonList.add(new DragonSort("Brt",185,37));    
                
        Collections.sort(dragonList);//magic happens.
            
        for(Dragon dg:dragonList){    
            System.out.println(dg.attackPwr+" "+dg.name+" "+dg.maxHealth);    
        }    
    }    
};
