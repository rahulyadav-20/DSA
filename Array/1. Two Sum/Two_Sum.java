
import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num2 = target - nums[i];
            if (mp.containsKey(num2)) {
                ans[0] = mp.get(num2);
                ans[1] = i;
                return ans;
            }
            mp.put(nums[i], i);
        }
        return ans;
    }
}

public class Two_Sum {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
    }
}
