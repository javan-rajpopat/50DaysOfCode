class Solution {
public:
    string shiftingLetters(string S, vector<int>& shifts) {
        string ans;
        vector<char> s;
        int i;
        vector<long long int> shift;
        for(i=0;i<shifts.size();i++){
            shift.push_back(1);
            shift[i]=accumulate(shifts.begin()+i, shifts.end(), 0);
            s.push_back(S[i]);
        }
        for(i=0;i<shift.size();i++){
            s[i]=(char)(((((int)s[i]-97)+(shift[i]%26))%26)+97);
        }
        for(i=0;i<s.size();i++){
            ans+=s[i];
        }
        return ans;
    }
};

