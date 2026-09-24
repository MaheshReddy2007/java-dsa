package arrays;

public class ElementCount
{
    static int eleCount(int[] array, int target) throws Exception
    {
        int low = 0, high = array.length - 1;
        int lowerBound = 0, upperBound = 0;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(array[mid] >= target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        if(low == array.length || array[low] != target)
        {
            throw new Exception("Element not found!");
        }

        lowerBound = low;

        low = 0;
        high = array.length - 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(array[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        upperBound = low;

        return upperBound - lowerBound;
    }

    public static void main(String[] args)
    {
        int[] array = {0,1,2,2,4,5};

        try
        {
            System.out.println(eleCount(array,2));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}