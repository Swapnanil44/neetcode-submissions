class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int countFresh = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                }
                if (grid[i][j] != 0) {
                    countFresh++;
                }
            }
        }

        int countRotten = 0, countMin = 0;
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };
        while (!q.isEmpty()) {
            int size = q.size();
            countRotten += size;
            for (int i = 0; i < size; i++) {
                int[] point = q.poll();
                for (int j = 0; j < 4; j++) {
                    int r = point[0] + dx[j];
                    int c = point[1] + dy[j];
                    if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == 0 || grid[r][c] == 2)
                        continue;

                    grid[r][c] = 0;
                    q.offer(new int[] { r, c });
                }
            }
            if (!q.isEmpty()) {
                countMin++;
            }
        }

        return countFresh == countRotten ? countMin : -1;
    }
}