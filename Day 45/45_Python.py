class Solution:
    def findWords(self, words: 'List[str]') -> 'List[str]':
        r1=set("qwertyuiiop")
        r2=set("asdfghjkl")
        r3=set("zxcvbnm")
        ans=[]
        for w in words:
            temp = w.lower()
            temp=set(temp)
            if set(temp)|set(r1) == r1 or set(temp)|set(r2) == r2 or set(temp)|set(r3) == r3:
                ans.append(w)
        return ans