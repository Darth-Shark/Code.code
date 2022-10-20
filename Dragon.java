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
    int workingDamage;//For breath weapon. Used to stor working damage amount.


    //Methods to create dragon and change it's states.
    public Dragon(String dragonName, int maxHealthAmount, int pwr){//defining various dragon stats.
        name=dragonName;
        maxHealth=maxHealthAmount;
        attackPwr=pwr;
        health=maxHealth;
        System.out.println("Created new dragon, " + name + ".");
    };
    public void setBreath(String newBreath){//Method to change breat weapon type.
        if(newBreath=="fire"){
            breathType=newBreath;
            System.out.println(name + "'s breath type succesfully set to " + newBreath + "!");
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
    if(isConsious=false){
        System.out.println(name + " is uncounsious and cannot fly.");//Error messsage.
    }
    else if(isFlying=true){
        isFlying=false;
    }
    else{
        isFlying=true;
    };
};
    public void breathe(){// Funtion for breath attack. Returns attack type and damage.
        //work in progress.
    };

    public boolean toObject (){//is the dragon in the air or not?
        return isFlying;
    };
    public void damage(int damageDelt){
        if(damageDelt>=-1){//Check to see is the damage delt is a valid ammount.
            health=health-damageDelt;
            if(isConsious=false){
                System.out.println(name + " has already been defeated.");
            }
            else if(health>=1){
                health=0;
                isConsious=false;
                System.out.println(name + " took " + damageDelt + " and was knocked uncounsious!");
                //Add if statement for the dragon losing consioucness while flying.
            }
            else{
                System.out.println(name + " took " + damageDelt + " damage and has " + health + " health remaining.");
            };
        }
        else{//Error message.
            System.out.println(damageDelt + "is an invalid damage amount!");
        };
    };
};
