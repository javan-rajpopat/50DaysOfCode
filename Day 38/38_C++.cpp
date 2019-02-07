class Solution {
public:
    bool isPowerOfTwo(int n) {
        long long p=1;
        while (p<=n){
            if (p==n){
                return true;
            }
            p*=2;
        }
        return false;
    }
};


