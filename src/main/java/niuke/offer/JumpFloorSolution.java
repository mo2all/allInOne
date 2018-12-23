package niuke.offer;

/**
 * @Description 青蛙跳台阶
 * @Author Skye
 * @Date 2018/12/10 9:11
 * @Version 1.0
 **/
public class JumpFloorSolution {


    public int JumpFloor(int target) {

        if (target == 0) return 0;
        if (target == 1) {
            return 1;
        }
        if (target == 2){
            return  JumpFloor(target -1) + 1;
        }
        return JumpFloor(target-1) + JumpFloor(target - 2);
    }

    public static void main(String[] args) {
        JumpFloorSolution solution = new JumpFloorSolution();
        int result = solution.JumpFloor(3);
        System.out.println("跳法："+result);
    }

}
