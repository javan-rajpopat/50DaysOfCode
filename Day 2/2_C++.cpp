class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        unordered_set<int> lot;
        int i,j,k;
        int sum=0,summ=0,dist=((nums[0]+nums[1]+nums[2])-target);
        if(dist<0){
            dist=dist*(-1);
        }
        for(i=0;i<nums.size();i++){
            for(j=i+1;j<nums.size();j++){
                for(k=j+1;k<nums.size();k++){
                    sum=nums[i]+nums[j]+nums[k];
                    sum=sum-target;
                    if(sum<0){
                        sum=sum*(-1);
                    }
                    if(dist>=sum){
                        dist=sum;
                        summ=nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return summ;
    }
};
