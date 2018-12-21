package niuke.offer;

/**
 * @Description 2*1矩形覆盖2*n
 * @Author Skye
 * @Date 2018/12/10 11:06
 * @Version 1.0
 **/
public class RectCoverSolution {
    public int RectCover(int target) {
       if (target == 1) return 1;
       else if (target == 2) return 2;
       else {
           return (int) (Math.pow(2, target/2) + (1+Math.pow(-1,target-1))/2);
       }
    }

    public static void main(String[] args) {
        RectCoverSolution solution = new RectCoverSolution();
        int result =solution.RectCover(4);
        System.out.println(result);
    }
}
