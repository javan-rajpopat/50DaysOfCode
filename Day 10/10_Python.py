# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def rangeSumBST(self, root, L, R):
        def rangeSumBSTs(node):
            if node is not None:
                if node.val>=L and node.val<=R:
                    self.s+=node.val
                rangeSumBSTs(node.right)
                rangeSumBSTs(node.left)
        self.s=0
        rangeSumBSTs(root)
        return self.s
            
        