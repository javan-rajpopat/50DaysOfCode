class Solution {
    public int trap(int[] height) {
        int flag=-1,m=0,water=0,temp,store;
        if (height.length<=1)
            return 0;
        for(int h=0;h<(height.length-1);h++){
            if (flag==-1 && height[h]!=0)
                flag=1;
            if (flag==1){
                int[] newArray = Arrays.copyOfRange(height, h+1, height.length);
                store = Arrays.stream(newArray).max().getAsInt();
                if (height[h]>m){
                    if (height[h]>=store)
                        m=store;
                    else
                        m=height[h];
                }
                else{
                    if (store > height[h]){
                        if (m < store)
                            water+=Math.abs(height[h]-m);
                        else
                            water+=Math.abs(height[h] - store);
                    }
                }
            }
        }
        return water;
    }
}