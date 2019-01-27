class Solution {
public:
    bool backspaceCompare(string S, string T) {
        vector<char> v1;
        vector<char> v2;
        int i;
        for(i=0;i<S.length();i++){
            if (S[i]=='#'){
                if (v1.size()!=0){
                    v1.pop_back();
                }
            }else{
                v1.push_back(S[i]);
            }
        }
        for(i=0;i<T.length();i++){
            if (T[i]=='#'){
                if (v2.size()!=0){
                    v2.pop_back();
                }
            }else{
                v2.push_back(T[i]);
            }
        }
        if (v1==v2){
            return true;
        }
        return false;
    }
};


