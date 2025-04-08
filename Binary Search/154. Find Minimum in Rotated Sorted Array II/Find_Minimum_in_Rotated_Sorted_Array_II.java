
class Solution {

    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            System.out.println(mid);
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                end--;
            }
            mid = start + (end - start) / 2;
        }
        return nums[start];
    }
}

public class Find_Minimum_in_Rotated_Sorted_Array_II {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 0};
        System.out.println("Minimum in [1, 2, 3, 4, 5, 6, 0]: " + solution.findMin(nums)); // Output: 0
    }
}
