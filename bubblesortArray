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
Output;
Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Try the new cross-platform PowerShell https://aka.ms/pscore6

'bubblesortArray'

unsorted item #0; 1
unsorted item #1; 3
unsorted item #2; 4
unsorted item #3; 5
unsorted item #4; 1
unsorted item #5; 23
unsorted item #6; 57
unsorted item #7; 126
unsorted item #8; 4
unsorted item #9; 543
unsorted item #10; 345
unsorted item #11; 23
unsorted item #12; 12
unsorted item #13; 45
unsorted item #14; 67
unsorted item #15; 97
Sorting...............................
Sorted item #0; 1
Sorted item #1; 1
Sorted item #2; 3
Sorted item #3; 4
Sorted item #4; 4
Sorted item #5; 5
Sorted item #6; 12
Sorted item #7; 23
Sorted item #8; 23
Sorted item #9; 45
Sorted item #10; 57
Sorted item #11; 67
Sorted item #12; 97
Sorted item #13; 126
Sorted item #14; 345
Sorted item #15; 543
PS C:\Users\Family\Desktop\NewJavaThing> 
