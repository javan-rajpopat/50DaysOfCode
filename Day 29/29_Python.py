# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def insertIntoBST(self, root, val):
        """
        :type root: TreeNode
        :type val: int
        :rtype: TreeNode
        """
        ans=root
        while root!=None:
            if root.val<val:
                if root.right==None:
                    root.right = TreeNode(val)
                    return ans
                else:
                    root = root.right
            else:
                if root.left==None:
                    root.left = TreeNode(val)
                    return ans
                else:
                    root = root.left