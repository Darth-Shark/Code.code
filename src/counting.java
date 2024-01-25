//import java.sql.Array;
import java.util.Random;

public class counting {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        for(i=1;i<=100;i++) {
            System.out.println(i);
            sum=sum+i;  
            if(i%2==1) {
                System.out.println("Odd");
            }
            else {
                System.out.println("Even");
            }
            System.out.println();
        }  
        System.out.print("total "+sum); 
    }
}
class countingtest {
    public static void main(String[] args) {
        Random rand = new Random();
        int l = rand.nextInt(99); //threw in a rand for good measure.
        int i = l + 1;
        System.out.println(i);
        if(i%2==1) {
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
        System.out.println();  
    }
}// Testing the even/odd calculator 

//Michael Rollins darthsharkmike@gmail.com

//for CTE software development 1

//instructor Mr Gross

class bubblesortArray {
    public static void main(String[] args) {
        int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.
        boolean isDone=false;
        int unsorted = arrayToSort.length - 1;
        int i=0;
        for(i=0;i<=arrayToSort.length-1;i++) {
            System.out.println("unsorted item #"+i+"; "+arrayToSort[i]);
        }
        System.out.print("Sorting...");
        while (!isDone) {
            isDone = true;
            for (int v = 0; v < unsorted; v++) {
                if (arrayToSort[v] > arrayToSort[v+1]) {
                    int savedNumber = arrayToSort[v];
                    arrayToSort[v] = arrayToSort[v+1];
                    arrayToSort[v+1] = savedNumber;
//                    swap(arrayToSort, v, v+1); //unfortunatly, swap dosen't seem to work for me
                    isDone = false;
                    //quirk to add more dots based on sorting time
                    System.out.print(".");
                }
            }
            unsorted--;
        }
        System.out.println("");
        for(i=0;i<=-1+arrayToSort.length;i++) {
            System.out.println("Sorted item #"+i+"; "+arrayToSort[i]);
        }
    }
}

class countingArrays {
    public static void main(String[] args) {
        int i=0;
        int f=1;
        int sum=0;
        int array[]=new int[100];  
        for(f=1;f<=100;f++) {
            array[f-1] = f;
            sum=sum+f; //Adding numbers and setting up array.
        }
        for(i=0;i<=-1+array.length;i++) { //In regards to '-1+array.length' ==>
//      Just using 'array/length' here would always throw an out-of-bounds exception
            int oddeven = array[i];
            System.out.println(array[i]);  
            if(oddeven%2==1) {  //determining even or odd
                System.out.println("Odd");
            }
            else {
                System.out.println("Even");
            }
            System.out.println();
        }
        System.out.print("total "+sum); 
    }
}

class testArrays {
    public static void main(String[] args) {
        int [ ] [ ] [ ] array = {{{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}}};
        for (int i = 0; i < 4; i++)
            System.out.print(array[0][0][i] + " ");
    }
}