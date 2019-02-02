class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0){
            return false;
        }
        if (matrix[0].length==0){
            return false;
        }
        for(int x=0;x<matrix.length;x++){
            if (target>=matrix[x][matrix[x].length-1]){
                if (target==matrix[x][matrix[x].length-1]){
                    return true;
                }
            }
            else{
                for(int y=0;y<matrix[x].length;y++){
                    if (target==matrix[x][y]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}


