//String class with some fun stuff. :)
//Created by Michael Rollins
//For CTE Software Development 2, 2024
//loading the scanner class
import java.util.*; //loading the arralist class
//I needed fewer imports this week.


class StringsThings {
    public static void main(String[] args) {
        int i = -1;//These are not the only possible values of i and j. I could set them both to zero if I fiddled with them a bit.
        int j = 0;//load my ints.
        int k;
        String invertPart;//load my strings
        String testString="the quick Brown Fox Jumped over the lazy dog";//words of wisdom
        ArrayList<String> StringList=new ArrayList<String>();//load my arraylists
        ArrayList<String> InvertList=new ArrayList<String>();
        System.out.println("Splitting test string: " + testString);
        
        for (String testPart: testString.split(" ")) {//this part is the important part.
            i++;
            System.out.println(testPart);
            StringList.add(i, testPart);//this part took some fine tuning to get all the values right.
        }
        System.out.println("Successfully printed " + (i+1) + " words.");
        System.out.println("Inverting string...");
        for (k=i; k>=0; k--){//be careful to avoid an indexOutOfBounds exception.
            invertPart = StringList.get(k);
            InvertList.add(j, invertPart);
            System.out.print(invertPart + " ");//the spaces that were removed earlier are re-added for coherency.
            j++;      
        }

        System.out.println();
        System.out.println("Successfully printed " + (j) + " words.");
        System.out.println(".");
        StringList.clear();
        System.out.println("..");//clearing the strings for easy code reuse.
        InvertList.clear();
        System.out.println("...");
        System.out.println("Please enter a sentence below. Use spaces to seperate words.");
//        System.out.print(";");//This may confuse the user. Unnecessary code.
        try (Scanner inputScanner = new Scanner(System.in)) {//scanner use!
            testString = inputScanner.nextLine();
            i = -1;//resetting the ints.
            j = 0;//k does not need to be reset.
        }//no catch block needed. The user cannot imput a non-string in this scenario. Maybe I should add one anyway...

        for (String testPart: testString.split(" ")) {//Copied code from above.
            i++;
            System.out.println(testPart);
            StringList.add(i, testPart);
        }
        System.out.println("Successfully printed " + (i+1) + " words.");
        System.out.println("Inverting string...");
        for (k=i; k>=0; k--){//k is defined here, no reset nedded.
            invertPart = StringList.get(k);
            InvertList.add(j, invertPart);
            System.out.print(invertPart + " ");  
            j++;      
        }

        System.out.println();
        System.out.println("Successfully printed " + (j) + " words.");//End of copied code.
    }
}

