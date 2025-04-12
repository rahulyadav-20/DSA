
class Solution {

    public boolean check(int m, int k, int num, int[] bloomDay) {
        int count = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= num) {
                count++;
                if (count == k) {
                    m--;
                    count = 0;
                }
            } else {
                count = 0;
            }
            if (m == 0) {
                return true;
            }
            //System.out.println(num+" "+k+" "+m);
        }

        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int ans = -1;
        int min = bloomDay[0];
        int max = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            min = Math.min(bloomDay[i], min);
            max = Math.max(bloomDay[i], max);
        }
        int start = min;
        int end = max;

        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (check(m, k, mid, bloomDay)) {
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

public class Make_m_Bouquets {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int result = solution.minDays(bloomDay, m, k);
        System.out.println("Minimum number of days to make " + m + " bouquets: " + result); // Output: 3
    }
}
