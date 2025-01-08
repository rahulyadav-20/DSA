
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    // Approach 1: Hashmap
    // Time complexity: O(n)
    // Space complexity: O(n)
    public List<Integer> majorityElement_1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            //System.out.println(i.getKey()+" "+i.getValue());
            if (i.getValue() > (nums.length / 3)) {
                ans.add(i.getKey());
            }
        }
        return ans;
    }
    // Approach 2 :sorting
    // Time complexity: O(nlogn)
    // Space complexity: O(1)

    public List<Integer> majorityElement_2(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int check_num = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == check_num) {
                count++;
            } else {
                if (count > nums.length / 3) {
                    ans.add(check_num);
                }
                count = 1;
                check_num = nums[i];
            }
        }
        if (count > nums.length / 3) {
            ans.add(check_num);
        }
        return ans;
    }
}

public class Majority_Element_II {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 2, 3, 1, 1, 1, 2, 2};
        System.out.println(s.majorityElement_2(nums));
    }
}
