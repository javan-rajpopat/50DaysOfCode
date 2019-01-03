class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        set<string> st;
        vector<string> lst = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        vector<char> alpha={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 
        string str;
        for(int i=0;i<words.size();i++){
            str="";
            for(int j=0;j<words[i].length();j++){
                for(int k=0;k<alpha.size();k++){
                    if(alpha[k]==words[i][j]){
                        str+=lst[k];
                    }
                }
            }
            st.insert(str);
        }
        return st.size();
    }
};
