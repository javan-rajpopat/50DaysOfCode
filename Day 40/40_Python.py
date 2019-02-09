class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        l=[]
        word=""
        for w in s:
            if w!=' ':
                word+=w
            else:
                if word!="":
                    l.append(word)
                word=""
        l.append(word)
        size=len(l)-1
        ans=""
        while size>=0:
            if l[size]!="":
                ans+=l[size]
                if size!=0:
                    ans+=" "
            size-=1
        return ans