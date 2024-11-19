import java.util.*;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]); 
        }

        for (int j = n - 1; j >= 0; j--) {
            int maxInColumn = 0;
            for (int i = 0; i < m; i++) {
                maxInColumn = Math.max(maxInColumn, grid[i][j]); 
            }
            result += maxInColumn; 
        }

        return result;
    }
}