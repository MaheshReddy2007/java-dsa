package arrays;

public class BinarySearch 
{
  static int binarySearch(int[] array,int key)
  {
    int low=0,high=array.length-1;
    while(low<=high)
    {
      int mid = low + (high-low)/2;
      if(array[mid]==key)
      {
        return mid;
      }
      else if(array[mid]>key)
      {
        high = mid-1;
      }else 
      {
        low = mid+1;
      }
    }
    return -1;
  }
  public static void main(String[] args)
  {
    int[] array = {1,2,3,4,5,6};
    int key = 3;
    int result = binarySearch(array,0);
    if(result!=-1)
    {
      System.out.println("Element found:"+result);
    }
    else
    {
      System.out.println("Element not found!");
    }
  }
}
