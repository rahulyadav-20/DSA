
class Solution {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    // Binary Search
    // This is a modified version of the binary search algorithm to handle duplicates.
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            //System.out.println(mid);
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                start++;
                end--;
            } else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            mid = start + (end - start) / 2;
        }
        return false;
    }
}

public class Search_in_Rotated_Sorted_Array_II {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        boolean result = solution.search(nums, target);
        System.out.println("Is target " + target + " present in the array? " + result); // Output: true

        int[] nums1 = {1, 0, 1, 1, 1};
        target = 0;
        result = solution.search(nums1, target);
        System.out.println("Is target " + target + " present in the array? " + result); // Output: true
    }
}
