import java.util.Scanner;
class Exercise2
{
  public static void main (String[] args )  
  {
    Scanner scan = new Scanner( System.in );
    String inputString;
    int times;
    int counter = 1;

    System.out.print( "Enter a word: " );
    inputString = scan.nextLine();
    times = inputString.length();

    while ( counter <= times )
    {
      System.out.println( inputString );
      counter++;
    }
  }
}