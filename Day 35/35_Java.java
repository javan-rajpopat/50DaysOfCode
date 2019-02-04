class Solution {
    public boolean search(int[] nums, int target) {
        if (nums.length==0){
            return false;
        }
        List<Integer> temp  = Arrays.stream(nums).boxed().collect(Collectors.<Integer>toList());
        int mn=Collections.min(temp);
        int mx=Collections.max(temp);
        int mni = temp.indexOf(mn);
        int mxi = temp.indexOf(mx);
        if (target<=mn){
            if (target == mn){
                return true;
            }
            else{
                return false;
            }
        }
        int x,iterator=0;
        if (target>=nums[0]){
            x=mxi+1;
        }else{
            iterator=mni;
            x=nums.length;
        }
        while (iterator<x){
            if (nums[iterator]==target){
                return true;
            }
            iterator++;
        }
        return false;
    }
}