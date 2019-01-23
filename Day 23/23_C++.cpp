class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> check, ans;
        for(int i=0;i<nums.size();i++){
            if(find(check.begin(), check.end(), nums[i]) != check.end()){
                ans.push_back(nums[i]);
            }else{
                check.push_back(nums[i]);
            }
        }
        return ans;
    }
};


