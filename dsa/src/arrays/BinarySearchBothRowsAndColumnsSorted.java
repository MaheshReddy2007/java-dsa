package arrays;
import java.util.Arrays;
public class BinarySearchBothRowsAndColumnsSorted {
	static int[] getIndex(int[][] matrix,int target)
	{
		int i = 0,j = matrix[i].length-1;
		while(i<matrix.length && j>=0)
		{
			if(matrix[i][j]==target)
			{
				return new int[] {i,j};
			}
			else if(matrix[i][j]>target)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args)
  {
		int[][] matrix = {{5,15,25,30},{17,16,26,31},{10,18,28,35},{20,21,30,40}};
		int[] result = getIndex(matrix,40);
		System.out.println(Arrays.toString(result));
  }
}
