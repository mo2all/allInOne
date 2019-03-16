package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 判断给定的一个数组，是不是可以分成两个数组之和相等的数组
 * @Author Skye
 * @Date 2019/3/16 17:30
 * @Version 1.0
 **/
public class Divide2EqualArray {
    /**
     * 典型的01背包问题，数组的重量和价值是一样的
     */
    int[][]dp;
    int[] res;
    int[] arr;
    public Divide2EqualArray(int[] arr){
        this.arr = arr;
    }
    public void divide(){
        int sum = 0;
        for (Integer item : arr){
            sum+=item;
        }
        int n = arr.length;
        int half = sum/2;
        dp = new int[n+1][half+1];
        for (int i=0;i <= n;i++){
            for (int j =0;j<=half;j++){
                if (i==0||j==0) dp[i][j] =0;
                else {
                    if (j<arr[i-1]){
                        //放不进
                        dp[i][j] = dp[i-1][j];
                    }else {
                        //放的进
                        dp[i][j] = Math.max(dp[i-1][j-arr[i-1]]+arr[i-1],dp[i-1][j]);
                    }
                }
            }
        }
        if (dp[n][half]*2 == sum ) {
            System.out.println();
            //TODO 打印被拆开的数组
            res = new int[n];
            find(n,half);
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            for (int i = 0;i< res.length;i++){
                if (res[i] == 0){
                    list1.add(arr[i]);
                }  else list2.add(arr[i]);
            }
            System.out.println(Arrays.toString(list1.toArray()));
            System.out.println(Arrays.toString(list2.toArray()));
        }
        else {
            System.out.println(false);
        }

    }
    private int[] find(int i,int j){
        if (i>0&&j>0){
            if (dp[i][j] == dp[i-1][j]) {
                res[i-1] = 0;
                find(i-1,j);
            }else if (dp[i][j] == dp[i-1][j-arr[i-1]]+arr[i-1]){
                res[i-1] = 1;
                find(i-1,j-arr[i-1]);
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String str = buffer.readLine();
        String[] strs = str.substring(str.indexOf("[")+1,str.indexOf("]")).split(",");
        int[] arr1 = new int[strs.length];
        for (int i =0;i<strs.length;i++){
            arr1[i] = Integer.parseInt(strs[i]);
        }
        Divide2EqualArray c = new Divide2EqualArray(arr1);
        c.divide();
    }
}
