package niuke.offer;

/**
 * @Description 变态跳台阶
 * @Author Skye
 * @Date 2018/12/10 9:41
 * @Version 1.0
 **/
public class JumpFloorIISolution {

    public int JumpFloorII(int target) {

        if (target == 0) return 1;
        else if (target == 1) {
            return 1;
        }
        else {
            return  2 * JumpFloorII(target -1);
        }
    }
    public static void main(String[] args) {
        JumpFloorIISolution solution = new JumpFloorIISolution();
        int result = solution.JumpFloorII(5);
        System.out.println("跳法："+result);
    }
}
