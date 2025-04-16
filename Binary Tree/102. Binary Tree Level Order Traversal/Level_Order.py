# Definition for a binary tree node.
from typing import Optional, List
from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result=[]
        if root is None:
            return result
        
        temp=root
        q=deque()
        q.append(temp)

        while q:
            size =len(q)
            level =[]
            for i in range(0,size):
                temp=q.popleft()
                level.append(temp.val)

                if temp.left:
                    q.append(temp.left)
                if temp.right:
                    q.append(temp.right)

            result.append(level)

        return result

if __name__=="__main__":
    # Example usage:
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)
    root.left.left.right=TreeNode(10)

    solution = Solution()
    print(solution.levelOrder(root))  # Output: [[1], [2, 3], [4, 5]]

        