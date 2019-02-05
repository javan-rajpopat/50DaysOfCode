class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<vector<int> > k;
        vector<int> temp;
        temp.push_back(1);
        k.push_back(temp);
        if (rowIndex==0){
            return temp;
        }
        temp.push_back(1);
        k.push_back(temp);
        if (rowIndex==1){
            return temp;
        }
        int c;
        vector<int> s;
        for(int count=2;count<=rowIndex;count++){
            s.clear();
            s.push_back(1);
            for(c=1;c<count;c++){
                s.push_back(k[count-1][c-1]+k[count-1][c]);
            }
            s.push_back(1);
            k.push_back(s);
        }
        return s;
    }
};


