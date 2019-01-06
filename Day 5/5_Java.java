class Solution {
    public int minMoves2(int[] nums) {
        int count=0;
        int m=nums.length;
        int[] s = new int[m];
        for(int j=0;j<nums.length;j++){
            s[j]=nums[j];
        }
        Arrays.sort(s);
        m=m/2;
        for(int i=0;i<nums.length;i++){
            count+=Math.abs(nums[i]-s[m]);
        }
        return count;
    }
}