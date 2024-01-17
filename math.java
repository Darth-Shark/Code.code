public class math{

    public static void main(String[] args){
        int a=128;
        byte b=(byte)a;
        byte c=(byte)b;
    //   System.out.println(a);
        // System.out.println(b);
        System.out.println(c);
    }
}
class GFG {
    public static void main(String[] args)
    {
  
        // Declaring variable
        int num1 = 10, num2 = 20;
  
        // Printing the variables
        System.out.print("The sum of ");
        System.out.println(
            num1 + " and " + num2 + " is:");
  
        // Printing the result after operation
        System.out.println(num1 + num2);
    }
}
class GFG2 {
    public static void main(String[] args)
    {
        System.out.println("Welcome");
        System.out.println("To");
        System.out.println("GeeksforGeeks");
    }
}
class err {
    public static void main(String[] args)
    {
        System.err.println("error");
        System.out.print("error");
    }
}      
class PrintLN {
    public static void main(String[] args)
    {
  
        // Declaring different datatypes
        int num = 10;
        char ch = 'G';
        String str = "GeeksforGeeks";
        double d = 10.2;
        float f = 13.5f;
        boolean bool = true;
  
        // Various overloads of println() method
        System.out.println();
        System.out.println(num);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(d);
        System.out.println(f);
        System.out.println(bool);
        System.out.println("Hello");
    }
}
class Demo_print {
    public static void main(String[] args){
        System.out.println("Using print()");
  
        // using print()
        // all are printed in the
        // same line
        System.out.print("GfG! ");
        System.out.print("GfG! ");
        System.out.print("GfG! ");
  
        System.out.println();
        System.out.println();
        System.out.println("Using println()");
  
        // using println()
        // all are printed in the
        // different line
        System.out.println("GfG! ");
        System.out.println("GfG! ");
        System.out.println("GfG! ");
    }
}
class JavaExample{
    public static void main(String[] args){
        int a = 10, b = 20;
        System.out.print("The product of ");
        System.out.println(a + " and " + b + " is: " + a*b);
    }
}
class JavaExample2 {
    public static void main(String[] args){
        System.out.print("print() statements: ");//remove 'ln' from 'println' for consistence.
        System.out.print("This ");
        System.out.print("is ");
        System.out.print("just ");
        System.out.print("a ");
        System.out.print("String ");
        //with ln tags
        System.out.println();//for new line
        System.out.println("println() statements:");
        System.out.println("This ");
        System.out.println("is ");
        System.out.println("just ");
        System.out.println("a ");
        System.out.println("String ");
    }
}
class SwitchDemo{
    public static void main(String[] args) {

        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
        }
        System.out.println(monthString);
    }
}
class SwitchDemoFallThrough {

    public static void main(String[] args) {
        java.util.ArrayList<String> futureMonths =
            new java.util.ArrayList<String>();

        int month = 1;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                     break;
            default:
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
               System.out.println(monthName);
            }
        }
    }
}
class GFG3 {
  
    // main driver method
    public static void main(String[] args)
    {
        int day = 5;
        String dayType;
        String dayString;
  
        // Switch case
        switch (day) {
  
        // Case
        case 1:
            dayString = "Monday";
            break;
  
        // Case
        case 2:
            dayString = "Tuesday";
            break;
  
            // Case
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
            break;
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        default:
            dayString = "Invalid day";
        }
  
        switch (day) {
            // Multiple cases without break statements
  
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            dayType = "Weekday";
            break;
        case 6:
        case 7:
            dayType = "Weekend";
            break;
  
        default:
            dayType = "Invalid daytype";
        }
  
        System.out.println(dayString + " is a " + dayType);
    }
}
class NestedForExample {  
    public static void main(String[] args) {  
      //loop of i  
      for(int i=1;i<=3;i++){  
        //loop of j  
        for(int j=1;j<=3;j++){  
              System.out.println(i+" "+j);  
            }//end of i  
        }//end of j  
    }  
}
class PyramidExample {  
    public static void main(String[] args) {
        int term=6;
        int terms=term-1;  
        for(int i=1;i<=terms;i++){  
            for(int j=1;j<=i;j++){  
                System.out.print("* ");  
            }  
            System.out.println();//new line  
        }      
        for(int i=1;i<=term;i++){  
            for(int j=term;j>=i;j--){  
                    System.out.print("* ");  
            }  
            System.out.println();//new line  
        }  
    }   
}
class Lamp {
  
    // stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;
  
    // method to turn on the light
    void turnOn() {
      isOn = true;
      System.out.println("Light on? " + isOn);
  
    }
  
    // method to turnoff the light
    void turnOff() {
      isOn = false;
      System.out.println("Light on? " + isOn);
    }
    public static void main(String[] args) {
  
        // create objects led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();
    
        // turn on the light by
        // calling method turnOn()
        led.turnOn();
    
        // turn off the light by
        // calling method turnOff()
        halogen.turnOff();
        led.turnOff();
    };
}
class light {
    // vaues for a lightswitch
    boolean ison=false;
    private String state="off";

    //method to toggle the lightswitch.
    void toggle(){
        if(ison==false){
            ison=true;
            state = "on";
            System.out.println("Turned '1' lights on.");
        }
        else{
            ison=false;
            state = "off";
            System.out.println("Turned '1' lights off.");
        };
    }
    //method to determine state of lightswitch
    void checkIsOn(){
        System.out.println("That light is " + state + ".");
    };
    public static void main(String[] args) {
  
        // creating objects
        light bathroom = new light();
        light hallway = new light();
        bathroom.ison = true;
//        bathroom.ison = true;

        //using various methods
        hallway.toggle();
        bathroom.toggle();
        bathroom.checkIsOn();
        hallway.toggle();
        bathroom.toggle();
        bathroom.checkIsOn();
        bathroom.toggle();
        hallway.toggle();
        
        //checking variables
        hallway.checkIsOn();
        bathroom.checkIsOn();
        System.out.println("Stop messing with the lights!");
        System.out.print("HallwayIsOn = " + hallway.ison + " BathroomIsOn = " + bathroom.ison);
    };
};


class B{
    public void m1(){
        System.out.println(1);
    };
    public void m2(){
        System.out.println(2);
    };
    public void m3(){
        System.out.println(3);
    };
    public void m0(){
        System.out.println(0);
    };
    public void general(int toUse){
        int i = toUse;
        if(i==0){
            this.m0();
        }
        else if(i==2){
            this.m2();
        }
        else if(i==3){
            this.m3();
        }
        else if(i==1){
            this.m1();
        }
    };

};
class A{
    boolean useB;
    int ID;

    public A(int num){
        ID = num;
    };
    public void useMethB(int toUse, B thisB){
    
        thisB.general(toUse);
    
    }
    public static void main(String[] args) {

        B bx = new B();
        A a1 = new A(1);

        a1.useMethB(1, bx);

    };
};

