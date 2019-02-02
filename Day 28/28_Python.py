def k(t):
        s="("
        s+=str(t.val)
        if t.left==None and t.right==None:
            s+=""
        else:
            if t.left!=None:
                s+=k(t.left)
            else:
                s+="()"
            if t.right!=None:
                s+=k(t.right)
        return s+")"
class Solution:    
    def tree2str(self, t):
        """
        :type t: TreeNode
        :rtype: str
        """
        if t==None:
            return ""
        s=""
        s += k(t)
        return s[1:-1]