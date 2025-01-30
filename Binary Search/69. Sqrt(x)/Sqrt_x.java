
class Solution {

    // Approach: Binary Search
    // Time Complexity: O(logn)
    // Space Complexity: O(1)
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int start = 0;
        int end = x;
        int mid = start + (end - start) / 2;
        int ans = 0;

        while (start <= end) {
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;

    }
}

public class Sqrt_x {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 10000; // Example input
        int result = solution.mySqrt(x);
        System.out.println("The square root of " + x + " is: " + result);
    }
}
