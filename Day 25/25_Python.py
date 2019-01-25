class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        if digits[len(digits)-1]!=9:
            digits[len(digits)-1]+=1
        else:
            count=len(digits)-1
            while digits[count]==9:
                digits[count]=0
                count-=1
            digits[count]+=1
            if count==-1:
                y=len(digits)
                digits=[]
                digits.append(1)
                for q in range(y):
                    digits.append(0)   
        return digits