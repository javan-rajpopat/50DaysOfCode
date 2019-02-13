class Solution {
public:
    int smallestRangeI(vector<int>& A, int K) {
        sort(A.begin(),A.end());
        int t1 = A[0];
        int t2= A[A.size()-1];
        if ((t1+K)>=(t2-K)){
            return 0;
        }
        return abs((t1+K)-(t2-K));
    }
};


