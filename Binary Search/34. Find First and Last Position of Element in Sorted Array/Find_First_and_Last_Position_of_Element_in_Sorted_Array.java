
class Solution {

    // Approach: Linear Search
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                first = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                last = i;
                break;
            }
        }
        int[] ans = {first, last};
        return ans;
    }

    // Approach: Binary Search
    // Time Complexity: O(logn)
    // Space Complexity: O(1)
    public int[] searchRange_1(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }

        start = 0;
        end = nums.length - 1;
        mid = start + (end - start) / 2;
        while (start <= end) {
            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        int[] ans = {first, last};
        return ans;
    }
}

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = sol.searchRange(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
        ans = sol.searchRange_1(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
