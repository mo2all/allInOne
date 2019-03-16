package interview;

import java.util.Arrays;

/**
 * @Description 招银网络科技面经
 * @Author Skye
 * @Date 2019/3/14 19:17
 * @Version 1.0
 **/
public class Rotate90 {
    public int[][] rotate(int[][] nums){
        int n = nums.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n;i++){
            for (int j = n-1; j>=0;j--){
                res[i][n-j-1] = nums[j][i];
            }
        }
        System.out.println(Arrays.deepToString(res));
        return res;
    }

    public static void main(String[] args) {
        Rotate90 c = new Rotate90();
        c.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
