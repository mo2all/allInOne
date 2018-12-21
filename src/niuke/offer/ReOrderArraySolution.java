package niuke.offer;

import java.util.Arrays;

/**
 * @Description 调整数组中的数字的顺序，使得奇数位于数组的前半部分，偶数位于数组的后半部分，并且奇数和偶数之间的位置都不变
 * @Author Skye
 * @Date 2018/12/13 20:56
 * @Version 1.0
 **/
public class ReOrderArraySolution {
    public void reOrderArray(int [] array) {
        int i=0, j=0, length = array.length;
        while(i < length && j < length) {
            while (i < length){
                //偶数条件成立
                if (array[i]/2 == (array[i]+1)/2) break;
                i++;
            }
            while (j < length){
                //奇数条件成立
                if ((array[j]/2 != (array[j]+1)/2) && j > i) break;
                j++;
            }
            if (j == length) break;
            for(int k = j; k > i; k--){
                exch(array, k-1, k);
            }

            i ++;
        }
    }
    private void exch(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        ReOrderArraySolution solution = new ReOrderArraySolution();
        solution.reOrderArray(a);
        System.out.println(Arrays.toString(a));
    }
}
