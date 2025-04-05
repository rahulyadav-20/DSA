
class Solution {

    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int pivot = 0;
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
        System.out.println(pivot);

        //left arr serach
        start = 0;
        end = pivot - 1;
        mid = start + (end - start) / 2;
        while (start < end) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        //right arr search
        start = pivot;
        end = nums.length - 1;
        mid = start + (end - start) / 2;
        while (start <= end) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;

    }
}

public class Search_in_Rotated_Sorted_Array {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 0};
        int target = 4;
        int result = solution.search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }
}
