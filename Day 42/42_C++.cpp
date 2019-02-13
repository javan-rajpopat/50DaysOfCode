class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        if (nums.size()==0){
            return 0;
        }
        int count=0,m=0;
        for(int i=0;i<nums.size();i++){
            if (nums[i]==1){
                count++;
            }else{
                if (count!=0){
                    if (count>m){
                        m=count;
                    }
                    count=0;
                }
            }
        }
        if (count!=0 && count>m){
            m=count;
        }
        return m;
    }
};

