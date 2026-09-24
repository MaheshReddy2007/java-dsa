package arrays;

public class FloorAndCeil 
{
    static int calFloor(int[] array, int target)
    {
        int low = 0;
        int high = array.length - 1;
        int floor = -1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(array[mid] <= target)
            {
                floor = array[mid];
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return floor;
    }

    static int calCeil(int[] array, int target)
    {
        int low = 0;
        int high = array.length - 1;
        int ceil = -1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(array[mid] >= target)
            {
                ceil = array[mid];
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return ceil;
    }

    static void floorAndCeil(int[] array, int target)
    {
        int floor = calFloor(array, target);
        int ceil = calCeil(array, target);

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }

    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8};

        floorAndCeil(array, 5);
    }
}