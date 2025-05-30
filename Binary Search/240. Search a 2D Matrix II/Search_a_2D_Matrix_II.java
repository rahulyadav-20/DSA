
class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int start = i * matrix[i].length;
            int end = start + matrix[i].length - 1;
            int mid = start + (end - start) / 2;

            while (start <= end) {
                int row = mid / matrix[0].length;
                int col = mid % matrix[0].length;

                if (matrix[row][col] == target) {
                    return true;
                } else if (matrix[row][col] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                mid = start + (end - start) / 2;
            }
        }
        return false;
    }
}

public class Search_a_2D_Matrix_II {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50},
            {60, 61, 62, 63}
        };
        int target = 3;
        boolean result = sol.searchMatrix(matrix, target);
        System.out.println(result); // Output: true
    }
}
