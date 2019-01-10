package interview;

/**
 * @Description 二分查找
 * @Author Skye
 * @Date 2018/12/28 10:55
 * @Version 1.0
 **/
public class BinarySearch {
    public static int find(int[] arr, int k){
        int lo = 0;
        int hi = arr.length-1;
        while (lo <= hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid] > k){
                hi = mid-1;
            }else if (arr[mid] < k){
                lo = mid+1;
            }else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(find( new int[]{1,2,10,15,100}, 0));
    }
}
