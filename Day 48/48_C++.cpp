class Solution {
public:
    int trap(vector<int>& height) {
        int flag=-1,m=0,water=0,temp,store;
        if (height.size()<=1)
            return 0;
        for(int h=0;h<(height.size()-1);h++){
            if (flag==-1 and height[h]!=0)
                flag=1;
            if (flag==1){
                store = *max_element(height.begin()+(h+1),height.end());
                if (height[h]>m){
                    if (height[h]>=store)
                        m=store;
                    else
                        m=height[h];
                }
                else{
                    if (store > height[h]){
                        if (m < store)
                            water+=abs(height[h]-m);
                        else
                            water+=abs(height[h] - store);
                    }
                }
            }
        }
        return water;
    }
};

            