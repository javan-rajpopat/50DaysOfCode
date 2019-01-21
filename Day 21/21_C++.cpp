class Solution {
public:
    int reverse(int x) {
        string st;
        long int ans;
        if(x>=0){
            st=to_string(x);
            std::reverse(st.begin(),st.end());
            ans=stol(st.c_str());
        }else{
            x*=-1;
            st=to_string(x);
            std::reverse(st.begin(),st.end());
            st='-'+st;
            ans=stol(st.c_str());
        }
        if(ans>=2147483647 || ans<= (-2147483648)){
            return 0;
        }
        return ans;
    }
};


