
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        if (root == null) {
            return ans;
        }
        TreeNode temp = root;
        s1.push(temp);
        System.out.println(temp.val);
        while (!s1.empty() || !s2.empty()) {
            List<Integer> level = new ArrayList<>();
            if (!s1.empty()) {
                while (!s1.empty()) {
                    temp = s1.peek();
                    level.add(temp.val);
                    s1.pop();
                    if (temp.left != null) {
                        s2.push(temp.left);
                    }
                    if (temp.right != null) {
                        s2.push(temp.right);
                    }
                }
            } else {
                while (!s2.empty()) {
                    temp = s2.peek();
                    level.add(temp.val);
                    s2.pop();
                    if (temp.right != null) {
                        s1.push(temp.right);
                    }
                    if (temp.left != null) {
                        s1.push(temp.left);
                    }
                }
            }
            ans.add(level);
        }
        return ans;
    }
}

public class Binary_Tree_Zigzag_Level_Order_Traversal {

    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = sol.zigzagLevelOrder(root);
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
