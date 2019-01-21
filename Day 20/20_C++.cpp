class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        int i,j,k;
        vector<char> mset;
        for(i=0;i<9;i++){
            mset.clear();
            for(j=0;j<9;j++){
                if (board[i][j]!='.'){
                    if(find(mset.begin(),mset.end(),board[i][j]) != mset.end()){
                        return false;
                    }else{
                        mset.push_back(board[i][j]);
                    }
                }
            }
        }
        for(i=0;i<9;i++){
            mset.clear();
            for(j=0;j<9;j++){
                if (board[j][i] != '.'){
                    if(find(mset.begin(),mset.end(),board[j][i]) != mset.end()){
                        return false;
                    }else{
                       mset.push_back(board[j][i]);
                    }
                }
            }
        }
        int arr[3][3]={{0,1,2},{3,4,5},{6,7,8}};
        vector<char> mset2,mset3;
        for(i=0;i<3;i++){
            mset.clear();
            for(j=0;j<3;j++){
                for(k=0;k<3;k++){
                    if (board[arr[i][j]][k] != '.'){
                        if (find(mset.begin(),mset.end(),board[arr[i][j]][k]) != mset.end()){
                            return false;
                        }else{
                            mset.push_back(board[arr[i][j]][k]);
                        }
                    }
                }
            }
            mset2.clear();
            for(j=0;j<3;j++){
                for(k=3;k<6;k++){
                    if (board[arr[i][j]][k] != '.'){
                        if (find(mset2.begin(),mset2.end(),board[arr[i][j]][k]) != mset2.end()){
                            return false;
                        }else{
                            mset2.push_back(board[arr[i][j]][k]);
                        }
                    }
                }
            }
            mset3.clear();
            for(j=0;j<3;j++){
                for(k=6;k<9;k++){
                    if (board[arr[i][j]][k] != '.'){
                        if (find(mset3.begin(),mset3.end(),board[arr[i][j]][k]) != mset3.end()){
                            return false;
                        }else{
                            mset3.push_back(board[arr[i][j]][k]);
                        }
                    }
                }
            }
        }
        return true;
    }
};


