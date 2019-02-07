class Solution {
    public boolean isPowerOfTwo(int n) {
        double p=1;
        while (p<=n){
            if (p==n){
                return true;
            }
            p*=2;
        }
        return false;
    }
}