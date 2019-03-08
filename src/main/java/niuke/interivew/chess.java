package niuke.interivew;

import java.util.Scanner;

/**
 * @Description 走棋盘
 * @Author Skye
 * @Date 2019/2/21 17:18
 * @Version 1.0
 **/
public class chess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] dp = new int[x+1][y+1];
        dp[0][0] = 0;
        for (int i = 1; i <= x; i ++) dp[i][0] = 1;
        for (int j = 1; j <= y; j++) dp[0][j] = 1;
        for (int i = 1;i <= x;i++){
            for (int j = 1;j <= y; j ++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        System.out.println(dp[x][y]);

    }
}
