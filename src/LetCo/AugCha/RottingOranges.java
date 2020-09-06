package LetCo.AugCha;

import java.util.Queue;

public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        while (check1Present(grid)) {
            boolean isChange = rottenOrange(grid);
            if (!isChange) {
                minutes = -1;
                break;
            }
            minutes++;
        }

        return minutes;
    }

    private boolean check1Present(int grid[][]) {
        boolean isPresent = false;

        outerLoop:
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    isPresent = true;
                    break outerLoop;
                }
            }
        }

        return isPresent;
    }

    private boolean rottenOrange(int grid[][]) {
        int rows = grid.length;
        int columns = grid[0].length;
        boolean isUpdated = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 2 || grid[i][j] == 0) {
                    System.out.println("grid value " + grid[i][j]);
                }
                if (grid[i][j] == 2) {

                    if (i + 1 < rows && grid[i + 1][j] == 1) {
                        grid[i + 1][j] = 121;
                        isUpdated = true;
                    }
                    if (j + 1 < columns && grid[i][j + 1] == 1) {
                        grid[i][j + 1] = 121;
                        isUpdated = true;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        grid[i][j - 1] = 121;
                        isUpdated = true;
                    }
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        grid[i - 1][j] = 121;
                        isUpdated = true;
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 121) grid[i][j] = 2;
            }
        }
        return isUpdated;
    }


public static void main(String[] args) {
        RottingOranges rt = new RottingOranges();
        int arr[][] = new int[1][6];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 2;
        arr[0][3] = 0;
        arr[0][4] = 2;
        arr[0][5] = 0;
        /*arr[2][0] = 1;
        arr[2][1] = 0;
        arr[2][2] =1;*/

        System.out.println(rt.orangesRotting(arr));
    }
}
