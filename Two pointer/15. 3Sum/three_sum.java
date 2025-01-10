
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

class Solution {

    //Approach 1: Brute Force
    //Time Complexity: O(n^3)
    //Space Complexity: O(n)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    //System.out.println(i+" "+j+" "+k+" ");
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.addAll(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>(new LinkedHashSet<>(ans));
        return result;
    }
}

public class three_sum {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = sol.threeSum(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }

    }

}
