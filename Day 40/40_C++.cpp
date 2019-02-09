class Solution {
public:
    void reverseWords(string &s) {
        vector<string> l;
        string word="";
        for(int w=0;w<s.length();w++){
            if (s[w]!=' '){
                word+=s[w];
            }else{
                if (word!=""){
                    l.push_back(word);
                }
                word="";
            }
        }
        l.push_back(word);
        int size=l.size()-1;
        string ans="";
        while (size>=0){
            if (l[size]!=""){
                ans+=l[size];
                if (size!=0){
                    ans+=" ";
                }
            }
            size--;
        }
        s=ans;
    }
};


