// BigNumberProgram.java

import java.util.Scanner;

public class BigNumberProgram
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner ( System.in );
    
    System.out.println( "Enter a number: " );
    int num = input.nextInt(); // get number input
    
    if ( num > 100 )
    {
      System.out.println( "You have a BIG number!" );
    }
    else
    {
      System.out.println( "You have a small number." );
    }
  }
}

