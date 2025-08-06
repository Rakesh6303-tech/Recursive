Write a program factorial number using recursive
import java.util.*;
public class Main {
    public static void main(String[] args) {
      int res = fact(5);
      System.out.print(res);
  }
  public static int fact(int i)
  {
    if(i!=0)
    {
         return i*fact(i-1);
    }
    return 1;
  }
}

process
fact(5)
=> 5 * fact(4)
       => 4 * fact(3)
              => 3 * fact(2)
                     => 2 * fact(1)
                            => 1 * fact(0)
                                   => 1 (base case)
Now resolve from the Bottom
fact(1) = 1 * 1 = 1  
fact(2) = 2 * 1 = 2  
fact(3) = 3 * 2 = 6  
fact(4) = 4 * 6 = 24  
fact(5) = 5 * 24 = 120  

