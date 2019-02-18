class Solution:
    def trap(self, height: 'List[int]') -> 'int':
        flag=-1
        m=0
        water=0
        for h in range(len(height)-1):
            if flag==-1 and height[h]!=0:
                flag=1
            if flag==1:
                if height[h]>m:
                    temp=max(height[h+1:])
                    if height[h]>=temp:
                        m=temp
                    else:
                        m=height[h]
                else:
                    if max(height[h+1:])>height[h]:
                        if m<max(height[h+1:]):
                            water+=abs(height[h]-m)
                        else:
                            water+=abs(height[h]-max(height[h+1:]))
            #print(water, " ", height[h], " ", m)
        return water
                
            