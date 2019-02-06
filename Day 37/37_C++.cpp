class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int> > k;
        vector<int> temp;
        if (numRows==0){
            return k;
        }
        temp.push_back(1);
        k.push_back(temp);
        if (numRows==1){
            return k;
        }
        temp.push_back(1);
        k.push_back(temp);
        if (numRows==2){
            return k;
        }
        int c;
        vector<int> s;
        for(int count=2;count<numRows;count++){
            s.clear();
            s.push_back(1);
            for(c=1;c<count;c++){
                s.push_back(k[count-1][c-1]+k[count-1][c]);
            }
            s.push_back(1);
            k.push_back(s);
        }
        return k;
    }
};