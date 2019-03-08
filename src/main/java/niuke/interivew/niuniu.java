package niuke.interivew;

import java.util.Scanner;

/**
 * @Description
 * @Author Skye
 * @Date 2019/2/20 19:29
 * @Version 1.0
 **/
public class niuniu {
    public static int solution(int x,int f,int d,int p){
        int result = (d+f*p)/(x+p);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputs = in.nextLine();
        String ints[] = inputs.split(" ");
        int [] nums = new int[4];
        for (int i = 0; i < ints.length;i ++){
            nums[i] = Integer.valueOf(ints[i]);
        }
        int res = solution(nums[0],nums[1],nums[2],nums[3]);
        System.out.println(res);
    }
}
