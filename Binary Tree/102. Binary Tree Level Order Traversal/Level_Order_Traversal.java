
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        val = data;
        left = null;
        right = null;
    }

}

class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        TreeNode temp = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(temp);

        while (!q.isEmpty()) {
            int size = q.size();

            List<Integer> level = new ArrayList<>();
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
        return result;
    }
}

public class Level_Order_Traversal {

    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = sol.levelOrder(root);
        for (List<Integer> level : result) {
            System.out.println(level);
        }
        // Output: [[1], [2, 3], [4, 5, 6, 7]]
    }
}
