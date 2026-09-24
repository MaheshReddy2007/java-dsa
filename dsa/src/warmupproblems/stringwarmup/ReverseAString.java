package warmupproblems.stringwarmup;
import java.util.Scanner;
public class ReverseAString 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String input = sc.nextLine();
    System.out.println(ReverseAString.stringReverse(input));
  }

  static String stringReverse(String input)
  {
    String rev = "";
    for(int i=input.length()-1;i>=0;i--)
    {
      rev = rev+input.charAt(i);  
    }
    return rev;
  }
}
