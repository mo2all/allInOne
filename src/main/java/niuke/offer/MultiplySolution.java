package niuke.offer;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/22 22:48
 * @Version 1.0
 **/
public class MultiplySolution {

    public int[] multiply(int[] A) {
        int n = A.length;
        int[] HeadToI = new int[n];
        int[] TailToI = new int[n];
        int[] res = new int[n];
        for(int i =0; i < n; i ++) {
            HeadToI[i] = i == 0 ? A[0]:HeadToI[i-1]*A[i];
        }
        for(int i = n-1; i >= 0; i --) {
            TailToI[i] = i == n-1 ? A[n-1]:TailToI[i+1]*A[i];
        }
        for(int i = 0;i < n;i ++) {
            if (i == 0) res[0] = TailToI[0];
            else if(i == n-1) res[n-1] = HeadToI[n-1];
            else res[i] = HeadToI[i-1]*TailToI[i+1];
        }
        return res;
    }

    public static void main(String[] args) {
        MultiplySolution solution = new MultiplySolution();
        solution.multiply(new int[]{1,2,3,4,5});
    }
}
