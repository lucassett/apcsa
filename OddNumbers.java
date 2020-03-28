// OddNumbers.java

import java.util.Scanner;

public class OddNumbers
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println( "Enter an integer: " );
    int num1 = input.nextInt();
    
    System.out.println( "Enter a bigger integer: " );
    int num2 = input.nextInt();

       
    //System.out.println( "Enter a number: " );
    //int num2 = input.nextInt();
    if (num1%2 == 0) // if input is even
       {
         num1++; // make odd
       }
       if (num2%2 == 0)
       {
         num2--; 
       }
    
    for ( num1 = num1; num1 <= num2; num1 += 2)
    {
      System.out.println( num1 );
    }
  }
}