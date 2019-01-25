class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        if (digits[digits.size()-1]!=9){
            digits[digits.size()-1]+=1;
            return digits;
        }else{
            int count=digits.size()-1;
            while (digits[count]==9){
                digits[count]=0;
                count-=1;
            }
            vector<int> ans;
            if (count==-1){
                ans.push_back(1);
                for(int i=0;i<digits.size();i++){
                    ans.push_back(0);
                }
                return ans;
            }
            digits[count]+=1;
        }
        return digits;
    }
};

