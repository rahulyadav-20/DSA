// File: binary_tree.java

// Definition for a binary tree node
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class binary_tree {

    // Method to insert a node into the binary tree
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Method to perform in-order traversal
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = null;

        // Insert nodes into the binary tree
        root = tree.insert(root, 5);
        root = tree.insert(root, 3);
        root = tree.insert(root, 7);
        root = tree.insert(root, 2);
        root = tree.insert(root, 4);
        root = tree.insert(root, 6);
        root = tree.insert(root, 8);

        // Perform in-order traversal
        System.out.println("In-order Traversal:");
        tree.inOrderTraversal(root);
    }
}
