package niuke.offer;

/**
 * @Description 从一个二维数组中（从左到右，从上到下递增的）查找是否包含某一整数
 * @Author Skye
 * @Date 2018/12/9 9:51
 * @Version 1.0
 **/
public class Solution {
    private boolean isContain = false;
    public boolean Find(int target, int [][] array) {
        int length;
        if(array.length > 1){
             length = array[0].length;
        }else{
             length = array.length;
        }
        int lo = 0, hi = length-1, mid = (lo + hi)/2;
        for(int i = 0; i < array.length && !isContain ; i++){
            binary(array[i], lo, mid, hi,target);
        }
        return isContain;
    }
    private void binary(int[] a, int lo, int mid, int hi, int cmp){
        if(a[hi] == cmp) isContain=true;
        if(lo>=hi) return;
        if(a[mid] > cmp) binary(a, lo, (lo+mid)/2,mid,cmp);
        else if(a[mid] < cmp) binary(a, mid+1,(mid+1+hi)/2,hi,cmp);
        else isContain = true;
    }

    public static void main(String[] args) {
//        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int[][] array ={{}};
        Solution solution = new Solution();
        boolean result = solution.Find(15, array);
        System.out.println(result);
    }

}
