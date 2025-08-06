write a program using recurive to print numbers from 10 to 1 
  Note  : Dont use the for loops

  import java.util.*; // Importing utility classes (not used in this program but can be used for input/output or collections)

public class Main {

    public static void main(String[] args) {
        // Calling the recursive function f1 with initial value 10
        f1(10);
    }

    // Recursive method that prints numbers from i down to 1
    public static void f1(int i) {
        System.out.println(i); // Print the current value of i

        // Base condition: if i is greater than 1, continue recursion
        if(i > 1) {
            f1(i - 1); // Recursive call with decremented value
        }

        // When i becomes 1, recursion stops as condition (i > 1) becomes false
    }
}
