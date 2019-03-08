package niuke.offer;

import java.util.Arrays;

/**
 * @Description 用归并排序计算逆序对
 * @Author Skye
 * @Date 2019/1/17 16:42
 * @Version 1.0
 **/
public class InversePairsSolution {
    private int aux[];
    private final int MOD = 1000000007;
    public int InversePairs(int [] array) {
        aux = new int[array.length];
        int count = sort(array, 0,array.length-1);
        return  count;
    }
    private int sort(int[] arr, int lo, int hi) {
        if (lo >= hi) return 0;
        int mid = (hi-lo)/2+lo;
        int leftCount = sort(arr,lo,mid);
        int rightCount = sort(arr,mid+1,hi);
        int mergeCount = merge(arr,lo,mid,hi);
        return (leftCount+rightCount+mergeCount)%MOD;
    }
    private int  merge(int[] arr,int lo,int mid,int hi) {
        int count = 0;
        for(int k = lo;k <= hi;k ++) {
            aux[k] = arr[k]; //把原数组复制到辅助数组
        }
        int i = mid,j=hi,k=hi;
        while(k>=lo){
            if(i<lo&&j>=mid+1) arr[k--] = aux[j--]; //左边的数组取尽
            else if(j<mid+1&&i>=lo) arr[k--] = aux[i--];//右边的数组取尽
            else if (aux[i]>aux[j]) {
                arr[k--] = aux[i--];//左边的值大于右边的
                count += j-mid;
            }else if (aux[i]<aux[j]){
                arr[k--] = aux[j--];
            }else {
                arr[k--] = aux[j--];
                count += j-mid-1;
            }
        }
        return count%MOD;
    }

    public static void main(String[] args) {
        InversePairsSolution solution = new InversePairsSolution();
        int[] ints = new int[] {7,5,4,6};
        int count = solution.InversePairs(ints);
        System.out.println(count);
        System.out.println(Arrays.toString(ints));
    }
}
