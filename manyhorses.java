//Michael Rollins darthsharkmike@gmail.com

//for CTE software development 1

//instructor Mr Gross

public class manyhorses {
    public static void main(String[] args) {
        Horse h1 = new Horse("Calf", 2022);
        Horse h2 = new Horse("Mare", 2121);
        Horse h3 = new Horse("Stallion", 203);
        System.out.print(h1.name + " " + h1.birthYear + ", " + h2.name + " " + h2.birthYear + ", " + h3.name + " " + h3.birthYear + ".");
    }  
};
output:
Calf 2022, Mare 2121, Stallion 203.
