
class Solution {

    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int pivot = 0;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (nums[0] > nums[mid] && nums[mid] < nums[(mid + 1) % (nums.length)]) {
                pivot = mid;
                end = mid - 1;
            } else if (nums[0] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return nums[pivot];

    }
}

public class Find_Minimum_in_Rotated_Sorted_Array {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 0};
        System.out.println("Minimum in [1, 2, 3, 4, 5, 6, 0]: " + solution.findMin(nums)); // Output: 0
    }
}
