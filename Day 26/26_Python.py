class Solution:
    def validSquare(self, p1, p2, p3, p4):
        """
        :type p1: List[int]
        :type p2: List[int]
        :type p3: List[int]
        :type p4: List[int]
        :rtype: bool
        """
        d = []
        d.append(math.hypot(p2[0]-p1[0], p2[1] - p1[1]))
        d.append(math.hypot(p3[0]-p1[0], p3[1] - p1[1]))
        d.append(math.hypot(p4[0]-p1[0], p4[1] - p1[1]))
        d.append(math.hypot(p3[0]-p2[0], p3[1] - p2[1]))
        d.append(math.hypot(p4[0]-p2[0], p4[1] - p2[1]))
        d.append(math.hypot(p4[0]-p3[0], p4[1] - p3[1]))
        d.sort()
        x=d[0]
        if x==0:
            return False
        for y in range(1,4):
            if x!=d[y]:
                return False
        return True
        