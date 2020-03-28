// PositiveNegative.java

import java.util.Scanner;

public class PositiveNegative
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner (System.in);
    
    System.out.println( "Enter any whole number - positive, negative, or zero: " );
    int num = input.nextInt();
    
    if (num > 0)
    {
      System.out.println( "Your number is positive." );
    }
    else if (num < 0)
    {
      System.out.println( "Your number is negative." );
    }
    else
    {
      System.out.println( "Your number is 0." );
    }
  }
}