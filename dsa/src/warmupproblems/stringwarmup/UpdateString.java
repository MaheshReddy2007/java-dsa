package warmupproblems.stringwarmup;
public class UpdateString 
{
  public static void main(String[] args) 
  {
     String name = "Mahesh reddy";
     System.out.println(UpdateString.updateName(name));
  }

  static String updateName(String name)
  {
    char[] charName = name.toCharArray();
    charName[7] = 'R';
    String updatedName = new String(charName);
    return updatedName;
  }
}
