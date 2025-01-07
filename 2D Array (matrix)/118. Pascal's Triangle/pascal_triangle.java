
import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        ans.add(innerList);

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            for (int j = 0; j < ans.get(i - 1).size() - 1; j++) {
                int data = ans.get(i - 1).get(j) + ans.get(i - 1).get(j + 1);
                temp.add(data);
            }
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}

public class pascal_triangle {

    public static void main(String[] args) {
        Solution s = new Solution();
        int numRows = 5;
        List<List<Integer>> ans = s.generate(numRows);

        for (List<Integer> i : ans) {
            System.out.println(i);
        }
    }
}
