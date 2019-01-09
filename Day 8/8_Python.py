class Solution:
    def maxIncreaseKeepingSkyline(self, grid):
        m = []
        for b in range(len(grid[0])):
            m.append(0)
            for a in grid:
                if a[b]>m[b]:
                    m[b]=a[b]
        n = []
        for a in grid:
            n.append(max(a))
        count = 0
        for x in range(len(grid)):
            for y in range(len(grid[x])):
                count+=min(m[x],n[y])-grid[x][y]
        return count
        
            
        