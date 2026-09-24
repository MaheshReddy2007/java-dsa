package warmupproblems.numberwarmup;
import java.util.Scanner;
public class ReverseANumber 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter then input");
    int input = sc.nextInt();

    System.out.println(ReverseANumber.reverse(input));
  }
  
  static int reverse(int input)
  {
    int rev = 0;
    while(input!=0)
    {
      int temp = input%10;
      rev = rev*10+temp;
      input = input/10;
    }
    return rev;
  }

}
