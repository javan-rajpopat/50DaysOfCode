class Solution:
    def countBits(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
        ans= []
        count=0
        for n in range(num+1):
            s=bin(n).replace("0b","")
            for each in s:
                if each=='1':
                    count+=1
            ans.append(count)
            count=0
        return ans