package arrays;
public class UpperBound 
{
  static int upperBound(int[] array,int key)
  {
    int low=0,high=array.length-1;
    while(low<=high)
    {
      int mid = low+(high-low)/2;
      if(array[mid]>key)
      {
        high = mid-1;
      }
      else
      {
        low = mid+1;
      }
    }
    return low;
  }
  public static void main(String[] args)
  {
    int[] array = {12,13,14,14,14,50,54};
    System.out.println(upperBound(array,14));
  }
}
