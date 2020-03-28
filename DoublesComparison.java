// DoublesComparison.java

import java.util.Scanner; // import Scanner class from Java Class libraires

public class DoublesComparison
{
 public static void main (String[] args)
  {
    Scanner s = new Scanner( System.in ); // Scanner variable declaration
    
    double num1; // first number
    double num2; // second number
    
    System.out.println( "Enter the first number: " );
    num1 = s.nextDouble(); // get first number
    
    System.out.println( "Enter the second number: " );
    num2 = s.nextDouble(); // get second number
    
    System.out.println( "Is the first number greater than (or equal to) the second number: " + ( num1 >= num2 ));
    
    System.out.println( "Is the first number less than the second number: " + ( num1 < num2 ));
    
    System.out.println( "Are the numbers equal: " + ( num1 == num2));
  }
}