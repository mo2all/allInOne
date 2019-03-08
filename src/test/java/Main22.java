/**
 * @Description
 * @Author Skye
 * @Date 2019/2/27 11:32
 * @Version 1.0
 **/
import java.util.*;
public class Main22 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        String str = in.nextLine();
        String[] strs = str.split(" ");
        int[] ints = new int[n];
        int[] res =  new int[n];
        for (int i = 0; i < n; i ++) {
            ints[i] = Integer.valueOf(strs[i]);
        }
        for(int i = 0; i < n; i ++){
            res[i] = ints[i];
            //反转数组
            for(int j = 0; j < (i+1)/2; j++){
                //交换res下标互补的两个的值，完成逆置
                int tmp = res[j];
                res[j] = res[i-j];
                res[i-j] = tmp;
            }
        }
        for(int i = 0;i < n; i ++){
            System.out.print(i==(n-1) ? (res[i]) : (res[i]+" "));
        }
    }

}