package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class Pratice1 
{
    public static void main(String[] args)
    {
      ArrayList<Integer> list = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the input length:");
      int inputLength = sc.nextInt();
      for(int i=0;i<inputLength;i++)
      {
        System.out.println("Enter elment "+(i+1)+":");
        list.add(sc.nextInt());
      }
      System.out.println(list);
    }
}
