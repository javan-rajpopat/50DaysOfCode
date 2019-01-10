class Solution {
public:
    int numJewelsInStones(string J, string S) {
        int i=0;
        int j=0;
        int count=0;
        for(i=0;i<S.length();i++){
            for(j=0;j<J.length();j++){
                if(S[i]==J[j]){
                    count++;
                }
            }
        }
        return count;
    }
};