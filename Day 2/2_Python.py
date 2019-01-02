class Solution:
    def threeSumClosest(self, nums, target):
        nums.sort()
        dif=nums[0]+nums[1]+nums[2]
        summ=dif
        dif=dif-target
        if dif<0:
            dif=dif*-1
        for i in range(len(nums)):
            a=nums[i]
            b=i+1
            c=len(nums)-1
            while b<c:
                bn=nums[b]
                cn=nums[c]
                tot=a+bn+cn
                sam=tot-target
                if sam==0:
                    return target
                if sam<0:
                    sam=sam*(-1)
                if dif>sam:
                    dif=sam
                    summ=tot
                if target>tot:
                    b+=1
                elif target<tot:
                    c-=1
        return summ
