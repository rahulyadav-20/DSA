
import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
                ans.add(i);
            }
        }
        return ans;
    }
}

public class Find_the_Peaks {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] mountain = {1, 3, 2, 4, 5, 3, 2, 1};
        List<Integer> peaks = solution.findPeaks(mountain);
        System.out.println("Peaks in [1, 3, 2, 4, 5, 3, 2, 1]: " + peaks); // Output: [1, 4]
    }
}
