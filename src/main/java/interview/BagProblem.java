package interview;

import java.util.Arrays;

/**
 * @Description 01背包问题
 * @Author Skye
 * @Date 2019/3/14 16:07
 * @Version 1.0
 **/
public class BagProblem {
    private int[] w;
    private int[] v;
    private  int n;
    private int[][] dp;
    private int[] res ;
    public BagProblem(int[] w, int[] v, int n){
        this.w = w;
        this.v = v;
        this.n = n+1;
        res = new int[w.length];
    }
    public void findMax(){
        int len = w.length;
        dp = new int[len][n+1];
        for (int i =0; i < len; i++){
            for (int j = 0; j < n; j ++){
                if (i == 0||j==0){dp[i][j] =0;}
                else {
                    if (w[i] > j){
                        //放不进
                        dp[i][j] = dp[i-1][j];
                    }else {
                        //放的进
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
                    }
                }
            }
        }
        int[] res = findRes(len-1,n-1);

        System.out.println("结果数组为(从第二位起)："+Arrays.toString(res));
        System.out.println("最大值为"+dp[len-1][n-1]);
    }
    public int[] findRes(int i, int j){
        if (i > 0) {
            //如果相等，则没有装该物品
            if (dp[i][j] == dp[i - 1][j]) {
                res[i] = 0; //标记0
                findRes(i-1,j);
            }
            else if (j - w[i]>=0 && dp[i-1][j-w[i]]+v[i] == dp[i][j]) {
                res[i] = 1;//标记1
                findRes(i - 1, j - w[i]);//回到包装之前的位置
            }
        }
        return res;
    }

    public static void main(String[] args) {
        BagProblem bag = new BagProblem(new int[]{0,2,3,4,5},new int[]{0,3,4,5,6},8);
        bag.findMax();
    }
}
