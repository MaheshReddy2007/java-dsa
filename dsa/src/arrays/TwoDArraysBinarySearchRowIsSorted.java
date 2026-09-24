package arrays;
import java.util.Arrays;
class TwoDArrayBinarySearchRowIsSorted {
    static int[] findTarget(int[][] matrix, int target) {
        int row = -1, column = -1;

        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] &&
                target <= matrix[i][matrix[i].length - 1]) {

                column = Arrays.binarySearch(matrix[i], target);

                if (column >= 0) {
                    row = i;
                    return new int[]{row, column};
                }
            }
        }

        return new int[]{row, column};
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 13, 14, 18}
        };

        int[] result = findTarget(matrix, 8);
        System.out.println(Arrays.toString(result));
    }
}