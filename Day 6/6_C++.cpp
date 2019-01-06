class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n=0;
        int count=0;
        int something=2;
        int i;
        int s=nums.size();
        while (n<(s-something)){
            if (nums[n]==nums[n+1]){
                if (nums[n]==nums[n+2]){
                    for(i = n; i < (s-1); i++){
                        nums[i] = nums[i + 1];
                    }
                    something++;
                    count++;
                    n--;
                }
            }
            n++;
        }
        return (s-count);
    }
};