class Solution {
public:
    int repeatedNTimes(vector<int>& A) {
        vector<int> B;
        for(int i=0;i<A.size();i++){
            if (find(B.begin(), B.end(), A[i]) != B.end()){
                return A[i];
            }
            else{
                B.push_back(A[i]);
            }
        }
    }
};