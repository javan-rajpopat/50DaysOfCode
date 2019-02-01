class MedianFinder:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.l = list()
        

    def addNum(self, num):
        """
        :type num: int
        :rtype: void
        """
        self.l.append(num)
        self.l.sort()

    def findMedian(self):
        """
        :rtype: float
        """
        if len(self.l)%2==0:
            one=int(len(self.l)/2)-1
            two=one+1
            return (self.l[one]+self.l[two])/2
        else:
            return self.l[int(len(self.l)/2)]
        


# Your MedianFinder object will be instantiated and called as such:
# obj = MedianFinder()
# obj.addNum(num)
# param_2 = obj.findMedian()