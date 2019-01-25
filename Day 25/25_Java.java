class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
            return digits;
        }else{
            int count=(digits.length)-1;
            while (digits[count]==9){
                digits[count]=0;
                count-=1;
                if(count==-1){
                    break;
                }
            }
            int ans[]= new int[digits.length+1];
            if (count==-1){
                ans[0]=1;
                for(int i=1;i<digits.length;i++){
                    ans[i]=0;
                }
                return ans;
            }
            digits[count]+=1;
        }
        return digits;
    }
}

