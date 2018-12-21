package niuke.offer;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/10 15:40
 * @Version 1.0
 **/
public class NumberOf1Solution {
    public int NumberOf1(int n) {
        int count=0;
        /*if (n>0){
            while (n != 0){
                int copy = n;
                 n = n >> 1;
                if((copy + 1)/2 != n) count ++;
            }
        }else if (n  < 0){
            int temp = n & 0x7f;
            while (temp != 0){
                int copy = temp;
                temp = temp >> 1;
                if ((copy + 1)/2 !=  temp) count ++;
            }
            count ++;
        }*/


        while (n != 0){
            int copy = n;
            n = n >>> 1;
            if((copy + 1)/2 != n) count ++;
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOf1Solution solution = new NumberOf1Solution();
        int result = solution.NumberOf1(-4);
        System.out.println(result);
    }
}
