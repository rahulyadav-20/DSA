
class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int max = piles[0];
        int min = piles[0];

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
            min = Math.min(min, piles[i]);
        }
        int ans = 0;
        int start = 1;
        int end = max;
        int mid = start + (end - start) / 2;
        int count = 0;
        while (start <= end) {
            //System.out.print(mid + " ");
            for (int i = 0; i < piles.length; i++) {
                int num = (int) Math.ceil((double) piles[i] / mid);
                //System.out.println(num);
                count += num;
            }
            //System.out.println(count);
            if (count > 0 && count <= h) {
                ans = mid;
                end = mid - 1;
            } else if (count > h) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            count = 0;
            mid = start + (end - start) / 2;
        }
        return ans;
    }
}

public class Koko_Eating_Bananas {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int result = solution.minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result); // Output: 4
    }
}
