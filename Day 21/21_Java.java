class Solution {
    public int reverse(int x) {
        int ans=x;
        long ans2=0;
        int last_digit;
        while(ans!=0){
            last_digit=ans%10;
            ans2=(ans2*10)+last_digit;;
            ans/=10;
        }
        if (ans2>=2147483647 || ans2<= -2147483648)
            return 0;
        return Math.toIntExact(ans2);
    }
}


