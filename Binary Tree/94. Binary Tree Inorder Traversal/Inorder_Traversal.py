
# Definition for a binary tree node.
from typing import List, Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def inOrder(self,root, ans):
        if root is None:
            return 
        self.inOrder(root.left, ans)
        ans.append(root.val)
        self.inOrder(root.right,ans) 

    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans=[]
        self.inOrder(root,ans)
        return ans

if __name__ == "__main__":
    sol = Solution()
    # Example usage:
    # Creating a binary tree: 1
    #                        /   \
    #                       2     3
    #                      / \
    #                     4   5
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)

    print(sol.inorderTraversal(root))  # Output: [4, 2, 5, 1, 3]
# Output: [4, 2, 5, 1, 3]    