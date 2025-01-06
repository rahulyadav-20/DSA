
import java.util.HashMap;

class Solution {

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefix_sum = new HashMap<>();

        int current_sum = 0;
        int count = 0;

        prefix_sum.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            current_sum += nums[i];
            int remove = current_sum - k;
            count = count + prefix_sum.getOrDefault(remove, 0);
            prefix_sum.put(current_sum, prefix_sum.getOrDefault(current_sum, 0) + 1);
        }
        return count;
    }
}

public class Subarray_sum_equel_k {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 5;
        int result = solution.subarraySum(nums, k);
        System.out.println(result);

    }
}
