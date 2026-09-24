package warmupproblems.stringwarmup;
import java.util.Scanner;
public class StringMethods 
{
  public static void main(String[] args)
  {
    /*  we no need to import the String class it automatically import since it 
        in java.lang package */
    String name = "Mahesh";
    // System.out.println(name.length());
    // System.out.println(name.charAt(1));

    // String replace = name.replace("ahesh","AHESH");
    //System.out.println(replace);

    // String substring1 = name.substring(2);
    // System.out.println(substring1);
    // String substring2 = name.substring(2,5);
    // System.out.println(substring2);

    // System.out.println(name.contains("sh"));
    // System.out.println(name.contains("mh"));

    // System.out.println(name.indexOf("h"));
    // System.out.println(name.lastIndexOf('h'));

    // startsWith(), endsWith()

    String str = "a,b,c";
    String[] array = str.split(",");
    System.out.println(array[0]+" "+array[1]+" "+array[2]);

    System.out.println(str.isEmpty());

    //toCharArray() concat()
    // 5. trim()

    String str2 = " hello ";
    System.out.println(str2.trim()); /* trim() method removes spaces of the string
                                      at beginning and ending */
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine().toUpperCase().trim();
    System.out.println(input);
  }
}
