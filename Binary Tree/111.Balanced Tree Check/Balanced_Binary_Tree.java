// Balanced Binary Tree Check

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

}

class Solution {

    //Time Complexity: O(n)
    //Space Complexity: O(h) where h is the height of the tree.
    int height(TreeNode root, boolean[] valid) {
        if (root == null) {
            return 0;
        }

        int l = height(root.left, valid);
        int r = height(root.right, valid);
        if (Math.abs(l - r) > 1) {
            valid[0] = false;
        }
        //System.out.println(l+" "+r);
        return 1 + Math.max(l, r);
    }

    public boolean isBalanced(TreeNode root) {
        boolean[] valid = new boolean[]{true};
        height(root, valid);
        return valid[0];
    }
}

public class Balanced_Binary_Tree {

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution solution = new Solution();
        boolean result = solution.isBalanced(root);
        System.out.println(result); // Output: true
    }
}
