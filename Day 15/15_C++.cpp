class Solution {
public:
    string customSortString(string S, string T) {
        map<char,int> dic;
        vector<char> list;
        int i,count=1;
        for(i=0;i<S.length();i++){
            dic[S[i]]=count;
            count++;
        }
        for(i=0;i<T.length();i++){
            if (dic.count(T[i])==0){
                dic[T[i]]=0;
            }
            list.push_back(T[i]);
        }
        int j,temp;
        for(i=0;i<list.size();i++){
            for(j=i+1;j<list.size();j++){
                if(dic[list[i]]>dic[list[j]]){
                    temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
        string str(list.begin(), list.end());
        return str;
    }
};

