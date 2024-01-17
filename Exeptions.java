//Humorous exeption handling by Michael Rollins.
//for CTE Software Development class 2022

public class Exeptions {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        int i = 5;
        int b = 2;
        int a = 0;
        try {
            System.out.println (ar[i]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println (e);
            System.out.println();
            System.out.println("Good job, you broke it. You tried to grab the sixth item from an array of five items.");
            System.out.println();
        }
        try {
            i = b / a;
        } catch(ArithmeticException e) {
            System.out.println (e);
            System.out.println();
            System.out.println ("Why. You divided by zero. Why.");
            System.out.println();
        }
        System.out.println ("Thank you for breaking this computer. Enjoy your horrible life.");
        System.out.println();
    }
}
