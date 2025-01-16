
import java.util.HashMap;

class Solution {

    // Brute force solution
    // Time complexity O(n^2)
    // Space complexity O(1)
    int maxLen_1(int arr[]) {
        int n = arr.length;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    maxi = Math.max(maxi, j - i + 1);
                }
            }
        }
        return maxi;
    }

    // Time complexity O(n)
    // Space complexity O(n)
    //Approach: 1. We will use a hashmap to store the sum and its index.
    int maxLen(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                int diff = i - map.get(sum);
                maxi = Math.max(maxi, diff);
            } else if (map.containsKey(sum)) {
                int diff = i - map.get(sum);
                maxi = Math.max(maxi, diff);
            } else {
                map.put(sum, i);
            }
        }
        return maxi;
    }
}

public class Largest_subarray_with_0_sum {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int ans = sol.maxLen(arr);
        int ans_1 = sol.maxLen_1(arr);
        System.out.println(ans);
        System.out.println(ans_1);
    }
}
