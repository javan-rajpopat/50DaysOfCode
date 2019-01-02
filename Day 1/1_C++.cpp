class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        string c;
        int check=0,checkk=0,lon=1,i,j;
        if(s[0]==NULL){        //condition for empty string
            return 0;
        }
        for(i=0;i<s.length();i++){
            for(j=0;j<c.length();j++){
                if(s[i]==c[j]){         //to check for unique entry
                    check=-1;
                    break;
                }
            }
            if(check==0){              
                c.push_back(s[i]);    
                if(lon<c.length()){
                    lon=c.length();   
                }
            }else{
                checkk++;        
                i=checkk;            
                c.clear();           //clear string if repeating character found
                c.push_back(s[i]);
                check=0;
            }
        }
        return lon;      //return length
    }
};
