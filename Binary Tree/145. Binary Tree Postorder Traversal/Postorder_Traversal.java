
import java.util.ArrayList;
import java.util.List;

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

    public void post(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        post(root.left, ans);
        post(root.right, ans);
        ans.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        post(root, ans);
        return ans;
    }
}

public class Postorder_Traversal {

    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution sol = new Solution();
        List<Integer> result = sol.postorderTraversal(root);
        System.out.println(result); // Output: [3, 2, 1]
    }
}
