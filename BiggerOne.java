// 8.53 - BiggerOne.java

import java.util.Scanner;

public class BiggerOne
{
  public static void main(String[] args)
  {
    
    Scanner s = new Scanner( System.in );
    
    System.out.println( "Enter a number: " );
    int num1 = s.nextInt();
    
    System.out.println( "Enter another number: " );
    int num2 = s.nextInt();
    
    if (num1 > num2 || num2 > num1)
    {
      System.out.println( "The bigger number is: " + isBigger(num1,num2) );
    }
    else
    {
      System.out.println( num1 );
    }
  }
  
  private static Integer isBigger(int Number1, int Number2)
  {
    if (Number1 > Number2)
    {
      return Number1;
    }
    else if (Number2 > Number1)
    {
      return Number2;
    }
    else
    {
      return Number1;
    }
  }
}
                               