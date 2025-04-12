
class Solution {

    public int shipWithinDays(int[] weights, int days) {
        if (weights.length < days) {
            return -1;
        }
        int sum = 0;
        int maxi = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }
        int start = maxi;
        int end = sum;
        int mid = start + (end - start) / 2;
        int ans = 0;
        while (start <= end) {
            //System.out.println(mid);
            int ship = 0;
            int count = 1;
            for (int i = 0; i < weights.length; i++) {
                ship += weights[i];
                if (ship > mid) {
                    count++;
                    ship = weights[i];
                }
            }
            if (count <= days) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;

    }
}

public class Capacity_To_Ship_Packages_Within_D_Days {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int result = solution.shipWithinDays(weights, days);
        System.out.println("Minimum capacity to ship within " + days + " days: " + result); // Output: 15
    }
}
