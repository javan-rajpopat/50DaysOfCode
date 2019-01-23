class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> a = new HashSet<Integer>();
        List ans = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){
                ans.add(nums[i]);
            }else{
                a.add(nums[i]);
            }
        }
        return ans;
    }
}

