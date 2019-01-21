class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i,j,k;
        Set<Character> mset=new HashSet<Character>();
        Set<Character> mset2=new HashSet<Character>();
        Set<Character> mset3=new HashSet<Character>();
        for(i=0;i<9;i++){
            mset.clear();
            for(j=0;j<9;j++){
                if (board[i][j]!='.'){
                    if(mset.contains(board[i][j])==true){
                        return false;
                    }else{
                        mset.add(board[i][j]);
                    }
                }
            }
        }
        for(i=0;i<9;i++){
            mset.clear();
            for(j=0;j<9;j++){
                if (board[j][i] != '.'){
                    if(mset.contains(board[j][i]) == true){
                        return false;
                    }else{
                       mset.add(board[j][i]);
                    }
                }
            }
        }
        int[][] arr=new int[][]{{0,1,2},{3,4,5},{6,7,8}};
        for(i=0;i<3;i++){
            mset.clear();
            for(j=0;j<3;j++){
                for(k=0;k<3;k++){
                    if (board[arr[i][j]][k] != '.'){
                        if (mset.contains(board[arr[i][j]][k])==true){
                            return false;
                        }else{
                            mset.add(board[arr[i][j]][k]);
                        }
                    }
                }
            }
            mset2.clear();
            for(j=0;j<3;j++){
                for(k=3;k<6;k++){
                    if (board[arr[i][j]][k] != '.'){
                        if (mset2.contains(board[arr[i][j]][k])==true){
                            return false;
                        }else{
                            mset2.add(board[arr[i][j]][k]);
                        }
                    }
                }
            }
            mset3.clear();
            for(j=0;j<3;j++){
                for(k=6;k<9;k++){
                    if (board[arr[i][j]][k] != '.'){
                        if (mset3.contains(board[arr[i][j]][k])==true){
                            return false;
                        }else{
                            mset3.add(board[arr[i][j]][k]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
        
        



