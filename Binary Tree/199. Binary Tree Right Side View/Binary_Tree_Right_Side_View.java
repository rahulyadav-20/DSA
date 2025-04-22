
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        Queue<TreeNode> q;
        q = new LinkedList<>();
        TreeNode temp = root;
        if (root == null) {
            return ans;
        }
        q.add(temp);

        while (!q.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                temp = q.poll();
                level.add(temp.val);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            result.add(level);
        }
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                //System.out.print(result.get(i).get(j)+" ");
                if (j == result.get(i).size() - 1) {
                    ans.add(result.get(i).get(j));
                }
            }
            //System.out.println();
        }
        return ans;

    }
}

public class Binary_Tree_Right_Side_View {

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        Solution solution = new Solution();
        List<Integer> result = solution.rightSideView(root);
        System.out.println(result); // Output: [1, 3, 4]
    }
}
