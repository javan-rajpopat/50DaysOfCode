class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int count=1;
        while (find(nums.begin(), nums.end(), count) != nums.end()){
            count++;
        }
        return count;
    }
};