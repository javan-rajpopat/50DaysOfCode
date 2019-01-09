class Solution {
public:
    int maxIncreaseKeepingSkyline(vector<vector<int>>& grid) {
        vector<int> m;
        int i,j;
        for(i=0;i<grid[0].size();i++){
            m.push_back(0);
            for(j=0;j<grid.size();j++){
                if(grid[j][i]>m[i]){
                    m[i]=grid[j][i];
                }
            }
        }
        vector<int> n;
        int max;
        for(i=0;i<grid.size();i++){
            max=grid[i][0];
            for(j = 1; j < grid[i].size(); j++)
            {
                if(grid[i][j] > max)
                {
                    max = grid[i][j];
                }
            }
            n.push_back(max);
        }
        int count=0;
        for(i=0;i<grid.size();i++){
            for(j=0;j<grid[i].size();j++){
                count+=(min(m[i],n[j])-grid[i][j]);    
            }
        }
        return count;
    }
};