package sortings;
import java.util.Arrays;
public class BubbleSort {
  static int[] bubbleSort(int[] arr)
  {
    int n =arr.length;
    for(int i=0;i<n-1;i++)
    {
      boolean isSorted = true;
      for(int j=0;j<n-1-i;j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          isSorted = false;
        }
      }
      if(isSorted)
      {
        return arr;
      }
    }
    return arr;
  }
  public static void main(String[] args)
  {
    int[] arr = {5,3,8,4,2,3};
    System.err.println("Before:");
    System.err.println(Arrays.toString(arr));
    System.err.println("After:");
    System.out.print(Arrays.toString(bubbleSort(arr)));
  }
}
