class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] m = new int[grid.length];
        int i,j;
        for(i=0;i<grid[0].length;i++){
            for(j=0;j<grid.length;j++){
                if(grid[j][i]>m[i]){
                    m[i]=grid[j][i];
                }
            }
        }
        int[] n = new int[grid[0].length];
        int max;
        for(i=0;i<grid.length;i++){
            max=grid[i][0];
            for(j = 1; j < grid[i].length; j++)
            {
                if(grid[i][j] > max)
                {
                    max = grid[i][j];
                }
            }
            n[i]=max;
        }
        int count=0;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[i].length;j++){
                count+=(Math.min(m[i],n[j])-grid[i][j]);    
            }
        }
        return count;
    }
}