
class Solution {

    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        if (nums.length == 1) {
            return nums[0];
        }
        while (start <= end) {
            System.out.println(mid);
            if ((mid - 1 < 0 || nums[mid] != nums[mid - 1]) && (mid + 1 == nums.length || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }
            int leftSize = mid - 1;
            if (nums[mid - 1] == nums[mid]) {
                leftSize = mid;
            }
            if (leftSize % 2 == 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;

    }
}

public class Single_Element_in_a_Sorted_Array {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int result = solution.singleNonDuplicate(nums);
        System.out.println("Single element in [1,1,2,2,3,3,4,4,5]: " + result); // Output: 5
    }
}
