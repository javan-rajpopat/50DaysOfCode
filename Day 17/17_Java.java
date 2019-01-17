class Solution {
    public int removeDuplicates(int[] nums) {
        int z;
        if (nums.length==0){
            return 0;
        }else if (nums.length==1){
            return 1;
        }
        int count=1;
        for(int i=0;i < nums.length-count;i++){
            if(nums[i]==nums[i+1]){
                z=i+1;
                i--;
                for(int j = z; j < nums.length-count; j++){ 
                      nums[j]=nums[j+1];
                }
                count++;
            }
        }
        count--;
        return nums.length-count;
    }
}