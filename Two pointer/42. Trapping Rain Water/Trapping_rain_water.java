
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    //Approach: Storing the left max and right max in two arrays and then taking the minimum of the two and subtracting the height[i] from it.

    public int trap(int[] height) {
        int water = 0;
        ArrayList<Integer> rightMax = new ArrayList<>();
        ArrayList<Integer> leftMax = new ArrayList<>();
        int maxi = -1;
        for (int i = 0; i < height.length; i++) {  //storing the left max
            maxi = Math.max(maxi, height[i]);
            leftMax.add(maxi);
        }
        maxi = -1;
        for (int i = height.length - 1; i >= 0; i--) { //storing the right max
            maxi = Math.max(maxi, height[i]);
            rightMax.add(maxi);
        }
        Collections.reverse(rightMax);
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
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    //Approach: 2 pointer approach

    public int trap_1(int[] height) {
        int water = 0;
        int maxi = height[0];
        int index = 0;
        int rightMax = height[0];
        int leftMax = height[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            if (height[i] > maxi) {
                maxi = height[i];
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            rightMax = Math.max(rightMax, height[i]);
            int diff = Math.min(rightMax, maxi) - height[i];
            if (diff > 0) {
                water += diff;
            }
        }

        for (int i = height.length - 1; i > index; i--) {
            leftMax = Math.max(leftMax, height[i]);
            int diff = Math.min(leftMax, maxi) - height[i];
            if (diff > 0) {
                water += diff;
            }
        }
        return water;

    }
}

public class Trapping_rain_water {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = sol.trap_1(height);
        System.out.println(result);
    }
}
