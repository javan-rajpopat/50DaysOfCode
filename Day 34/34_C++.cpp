class Solution {
public:
    int search(vector<int>& nums, int target) {
        if (nums.size()==0){
            return -1;
        }
        int mn= *min_element(nums.begin(),nums.end());
        int mni = find (nums.begin(), nums.end(), mn) - nums.begin(); 
        int mx= *max_element(nums.begin(),nums.end());
        int mxi = find (nums.begin(), nums.end(), mx) - nums.begin(); 
        //cout<<mn<<" "<<mni<<" "<<mx<<" "<<mxi;
        if (target<=mn){
            if (target == mn){
                return mni;
            }
            else{
                return -1;
            }
        }
        int x,iterator=0;
        if (target>=nums[0]){
            x=mxi+1;
        }else{
            iterator=mni;
            x=nums.size();
        }
        while (iterator<x){
            if (nums[iterator]==target){
                return iterator;
            }
            iterator++;
        }
        return -1;
    }
};


        
        