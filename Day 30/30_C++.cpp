class Solution {
public:
    vector<int> shortestToChar(string S, char C) {
        vector<int> ans;
        vector<int> output;
        vector<int> check;
        int i,j,temp;
        for(i=0;i<S.length();i++){
            if(S[i]==C){
                check.push_back(i);
            }
        }
        for(i=0;i<S.length();i++){
            for(j=0;j<check.size();j++){
                ans.push_back(abs(check[j]-i));
            }
            temp=*(std::min_element(ans.begin(),ans.end()));
            output.push_back(temp);
            ans.clear();
        }
        return output;
    }
};