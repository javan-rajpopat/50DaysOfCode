class Solution {
public:
    vector<int> diStringMatch(string S) {
        vector<int> v;
        for(int i=0;i<=S.length();i++){
            v.push_back(i);
        }
        vector<int> b;
        for(int j=0;j<S.length();j++){ 
            if (S[j]=='I'){
                b.push_back(v.front());
                v.erase(v.begin());
            }else{
                b.push_back(v.back());
                v.pop_back();
            }
        }
        b.push_back(v.front());
        return b;
    }
};