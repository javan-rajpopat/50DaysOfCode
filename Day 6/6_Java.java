class Solution {
    public int removeDuplicates(int[] nums) {
        int n=0;
        int count=0;
        int something=2;
        int i;
        while (n<(nums.length-something)){
            if (nums[n]==nums[n+1]){
                if (nums[n]==nums[n+2]){
                    for(i = n; i < nums.length -1; i++){
                        nums[i] = nums[i + 1];
                    }
                    something++;
                    count++;
                    n--;
                }
            }
            n++;
        }
        return ((nums.length)-count);
    }
}