class Solution:
    def shiftingLetters(self, S, shifts):
        """
        :type S: str
        :type shifts: List[int]
        :rtype: str
        """
        s=list(S)
        ans=""
        for x in range(len(shifts)):
            shifts[x]=sum(shifts[x:])
        for y in range(len(shifts)):
            s[y]=chr((((ord(s[y])-97)+(shifts[y]%26))%26)+97)
        for x in s:
            ans+=x
        return ans