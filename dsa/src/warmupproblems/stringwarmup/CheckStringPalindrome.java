package warmupproblems.stringwarmup;
import java.util.Scanner;
public class CheckStringPalindrome 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String original = sc.nextLine();
    String reverse = "";
    for(int i= original.length()-1; i>=0 ; i--)
    {
      reverse = reverse + original.charAt(i);
    }
    if(original.equals(reverse))
    {
      System.out.println(reverse+" is palindrome");
    }
    else
    {
      System.out.println(reverse+" is not palindrome");
    }
  }
}
