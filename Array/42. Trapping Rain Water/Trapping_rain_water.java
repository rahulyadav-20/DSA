
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(n)

    public int trap(int[] height) {
        int water = 0;
        ArrayList<Integer> rightMax = new ArrayList<>();
        ArrayList<Integer> leftMax = new ArrayList<>();
        int maxi = -1;
        for (int i = 0; i < height.length; i++) {  //storing the right max
            if (height[i] > maxi) {
                maxi = height[i];
                rightMax.add(height[i]);
            } else {
                rightMax.add(maxi);
            }
        }
        maxi = -1;
        for (int i = height.length - 1; i >= 0; i--) { //storing the left max
            if (height[i] > maxi) {
                maxi = height[i];
                leftMax.add(height[i]);
            } else {
                leftMax.add(maxi);
            }
        }
        Collections.reverse(leftMax);
        for (int i = 0; i < height.length; i++) {
            int diff = Math.min(rightMax.get(i), leftMax.get(i)) - height[i]; //taking the minimum of the two
            if (diff > 0) {
                water += diff;
            }
        }
        // for(int i:rightMax){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // for(int i:leftMax){
        //     System.out.print(i+" ");
        // }

        return water;
    }
}

public class Trapping_rain_water {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = sol.trap(height);
        System.out.println(result);
    }
}
