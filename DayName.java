// 8.52 - DayName.java

import java.util.Scanner; // import Scanner

public class DayName
{
  public static void main(String[] args)
  {
    
    Scanner s = new Scanner( System.in );
    
    int num; // day of week 
    
    System.out.println( "Enter the day of the week as a number: " );
    num = s.nextInt();
    
    // String result = getName( num );
    System.out.println ( "Today is: " + getName( num ));
  }
  
  private static String getName(int day)
  {
    if (day == 1)
    {
      return "Sunday";
    }
    else if (day == 2)
    {
      return "Monday";
    }
    else if (day == 3)
    {
      return "Tuesday";
    }
    else if (day == 4)
    {
      return "Wednesday";
    }
    else if (day == 5)
    {
      return "Thursday";
    }
    else if (day == 6)
    {
      return "Friday";
    }
    else if (day == 7)
    {
      return "Saturday";
    }
    else
    {
      return "That is not a day.";
    }
  }
}

  
    