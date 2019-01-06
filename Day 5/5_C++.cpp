class Solution {
public:
    int minMoves2(vector<int>& nums) {
        int count = 0;
        int m=nums.size();
        vector<int> s;
        for(int j=0;j<m;j++){
            s.push_back(nums[j]); 
        }
        sort(s.begin(), s.end()); 
        int x=m;
        m=m/2;
        for(int i=0;i<x;i++){
            count+=abs(nums[i]-s[m]);
        }
        return count;
    }
};