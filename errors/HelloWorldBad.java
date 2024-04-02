//Editted by Michael Rollins
//Made by Kim Gross

class HelloWorldBad {
    public static void main(String[] args) {
        
        for (int i=0;i<25;i++){
            System.out.println("the value of i is "+i);
            if (i==1){//Added an equals sign. One sign defines a variable, so this line was just seting the value of i to one, instead of comparing i to one.
                System.out.println("i is equal to 1");
            }
        }    
    }//Deleted tabs for readability.
}
