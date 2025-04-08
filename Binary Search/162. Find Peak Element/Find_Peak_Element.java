
class Solution {

    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        if (nums.length <= 1) {
            return 0;
        }
        while (start <= end) {
            if (((mid - 1) < 0 || nums[mid - 1] < nums[mid]) && (mid + 1 == nums.length || nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (mid + 1 == nums.length || nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return mid;
    }
}

public class Find_Peak_Element {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = sol.findPeakElement(nums);
        System.out.println("Peak element index: " + result); // Output: 8 (index of 9)

    }
}
