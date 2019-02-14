class Solution {
public:
    vector<string> findWords(vector<string>& words) {
        int j;
        string r1="qwertyuiop";
        set<char> sr1;
        for(j=0;j<r1.length();j++){
            sr1.insert(r1[j]);
        }
        string r2="asdfghjkl";
        set<char> sr2;
        for(j=0;j<r2.length();j++){
            sr2.insert(r2[j]);
        }
        string r3="zxcvbnm";
        set<char> sr3;
        for(j=0;j<r3.length();j++){
            sr3.insert(r3[j]);
        }
        
        set<char> temp;
        set<char> comp;
        string a;
        vector<string> ans;
        for(int i=0;i<words.size();i++){
            temp.clear();
            a=words[i];
            transform(words[i].begin(), words[i].end(), words[i].begin(), ::tolower);
            for(j=0;j<words[i].length();j++){
                temp.insert(words[i][j]);
            }
            comp = temp;
            comp.insert(sr1.begin(),sr1.end());
            if(comp==sr1){
                ans.push_back(a);
            }
            comp.clear();
            comp = temp;
            comp.insert(sr2.begin(),sr2.end());
            if(comp==sr2){
                ans.push_back(a);
            }
            comp.clear();
            comp =temp;
            comp.insert(sr3.begin(),sr3.end());
            if(comp==sr3){
                ans.push_back(a);
            } 
        }
        return ans;
    }
};

