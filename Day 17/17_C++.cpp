class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int z;
        if (nums.size()==0){
            return 0;
        }else if (nums.size()==1){
            return 1;
        }
        for(int i=0;i<nums.size()-1;i++){
            if (nums[i]==nums[i+1]){
                z=i+1;
                nums.erase(nums.begin()+z);
                i--;
            } 
        }
        return nums.size();
    }
};