class Solution {
    private static final int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    private int dfs(int[][] grid,int r,int c){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0){
            return 0;
        }

        grid[r][c] = 0;
        int res = 1;
        for(int[] dir: directions){
            res += dfs(grid,r+dir[0],c+dir[1]);
        }
        return res; 
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        int area = 0;
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(grid[i][j] == 1){
                    area = Math.max(area,dfs(grid,i,j));
                }
            }
        }
        return area;
    }
}