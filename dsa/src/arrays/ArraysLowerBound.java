package arrays;

public class ArraysLowerBound 
{
  static int getLowerBound(int[] array,int key)
  {
    int low = 0,high = array.length-1;
    while(low<=high)
    {
      int mid = low+(high-low)/2;
      if(array[mid]>=key)
      {
        high = mid-1;
      }else
      {
        low = mid+1;
      }
    }
    return low;
  }
  public static void main(String[] args)
  {
    int[] array = {1,2,3,4,4,5,7};
    int lowerBound = getLowerBound(array,6);
    System.out.println("Lower Bound:"+lowerBound);
  }
}
