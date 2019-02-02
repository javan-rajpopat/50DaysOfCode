class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if (matrix.size()==0){
            return false;
        }
        if (matrix[0].size()==0){
            return false;
        }
        for(int x=0;x<matrix.size();x++){
            if (target>=matrix[x][matrix[x].size()-1]){
                if (target==matrix[x][matrix[x].size()-1]){
                    return true;
                }
            }
            else{
                for(int y=0;y<matrix[x].size();y++){
                    if (target==matrix[x][y]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
};



