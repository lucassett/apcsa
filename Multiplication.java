// Multiplication.java

import java.util.Scanner; // import Scanner class from Java Class libraires

public class Multiplication
{
  public static void main (String[] args)
  {Scanner input = new Scanner ( System.in ); // variable declaration for a Scanner object
    
    int num1; // first number
    int num2; // second number
    int num3; // third number
    int prod; // product of first two numbers
    int Prod; // product of the three numbers
    
    System.out.println( "Enter the first number: " );
    num1 = input.nextInt(); // get first number
    
    System.out.println( "Enter the second number: " );
    num2 = input.nextInt(); // get second number
    
    prod = num1 * num2; 
    System.out.println( "The product of the first two numbers is " + prod ); // get intermediate product
    
    System.out.println( "Enter the third number: " );
    num3 = input.nextInt(); // get third number
    
    Prod = num1 * num2 * num3; // get product by multiplyting the numbers
    
    System.out.println( "The product of all three numbers is " + Prod );
  }
}

    