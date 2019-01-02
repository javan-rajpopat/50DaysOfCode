class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0,summ=0,dist=0,i=0;
        dist=nums[0]+nums[1]+nums[2];
        summ=nums[0]+nums[1]+nums[2];
        dist=dist-target;
        if(dist<0){
            dist=dist*(-1);
        }
        int a=0,b=0,c=0,bn=0,cn=0,tot=0;
        for(i=0;i<(nums.length-2);i++){
            a=nums[i];
            b=i+1;
            c=nums.length-1;
            while(b<c){
                bn=nums[b];
                cn=nums[c];
                tot=a+bn+cn;
                sum=tot-target;
                if(sum==0){
                    return target;
                }
                if(sum<0){
                    sum=sum*-1;
                }
                if(dist>=sum){
                    dist=sum;
                    summ=tot;
                }
                if(tot<target){
                    b++;
                }else{
                    c--;
                }
            }
        } 
        return summ;
    }
}
