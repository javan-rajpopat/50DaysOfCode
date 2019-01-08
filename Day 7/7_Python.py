class Solution:
    def diStringMatch(self, S):
        lst = list(range(len(S)+1))
        c = []
        for a in S:
            if a == 'I':
                c.append(lst[0])
                lst.pop(0)
            else:
                c.append(lst[-1])
                del lst[-1]
        c.append(lst[0])
        return c