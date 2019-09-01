package LeetCode;

public class GameLife {
    public static void main(String[] args) {

        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int m = board.length;
        int n = board[0].length;
        int[][] res = new int[m + 2][n + 2];
        for (int i = 0; i < m + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                if (i == 0 || i == m + 1 || j == 0 || j == n + 1) {
                    res[i][j] = 0;
                } else {
                    res[i][j] = board[i - 1][j - 1];
                }
            }
        }
        int sum;
        for (int p = 1; p <= m; p++) {
            for (int q = 1; q <= n; q++) {
                sum = 0;
                sum = res[p - 1][q - 1] + res[p - 1][q] + res[p - 1][q + 1] + res[p][q - 1] + res[p][q + 1] + res[p + 1][q - 1] + res[p + 1][q] + res[p + 1][q + 1];
                if (sum < 2 || sum > 3) {
                    board[p - 1][q - 1] = 0;
                } else if (sum == 3) {
                    board[p - 1][q - 1] = 1;
                } else {
                    if (res[p][q] == 0) {
                        board[p - 1][q - 1] = 0;
                    } else {
                        board[p - 1][q - 1] = 1;
                    }
                }
            }
        }
        System.out.println(board);
    }
}
