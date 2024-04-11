//Editted by Michael Rollins
/*
Error filled file created by
Kimg@techtrepacademy.com
for my java class to learn troubleshooting on
*/
public class error {//Changed "Main" to "error"
    public static void main(String[] args) {//Added this line so the code can be run. Also added many tabs for readability.
        int i;//Initializing the "i" variable seperately. Uncapitalized "Int".
        boolean debug;
        debug = true;//Comment out this line to disable debug print statements.

        if (debug) {
            System.out.println("Initiating program"); //The usefulness of this line is eclipsed by the two print statements below it.
        }

        System.out.println("hello everybody");
        System.out.println("am I doing this correctly");//I think you wanted to add a question mark here. That's not exactly an error, but still.
        for (i=0;i<10;i++){//Deleted, "int"
            System.out.println("the number i is "+i);//Corrected "printlm" to "println".
            if (i==0){//Copy and pasted this function from the for loop below.
                System.out.println("i is equal to zero");

            }else {
                System.out.println("i is not equal to zero");

            }
        }
        
        if(debug) {
            System.out.println("Advancing to second step of program.");//This code is already filled with print statements, this is one of the few places it makes sence to insert one.
        }

        for (i=9;i>-1;i--){//Uncapitalized "For", changed a colon to a semicolon, deleted "int", changed the logic of the loop.
        //I am not quite sure what you wanted this loop to do differently than the first one, so I made it count down from ten instead of up from zero.
            System.out.println("the new number i is "+i);
        
            if (i==0){//Moved this range into the for loop. Added tabs for readibility.
                System.out.println("i is equal to zero");//Changed to println.

            }else {
                System.out.println("i is not equal to zero");//Capetelised "system", changed to println.

            }
        }
        //what other errors can I put into a source code file?
        //Many. :)

        if(debug) {
            System.out.println("Halting Program");//Informes the user that the code halted intentionally.
        }

    }
}
