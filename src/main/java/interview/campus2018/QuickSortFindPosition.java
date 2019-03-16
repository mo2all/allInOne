package interview.campus2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description 使用快速排序，查找在没有交换的数字
 * @Author Skye
 * @Date 2019/3/15 9:06
 * @Version 1.0
 **/
public class QuickSortFindPosition {
    private int count = 0;
    private int getCount(){
        return count;
    }
    public void sort(int[] nums,int lo,int hi){
        if(lo >= hi) return;
        int p = partition(nums,lo,hi);
        sort(nums,lo,p-1);
        sort(nums,p+1,hi);
        return;
    }
    public int partition(int[] nums,int lo,int hi){
        int i=lo,j=hi+1;
        while(true){
            while(nums[++i] < nums[lo]){
                if(i == hi) break;
            }
            while(nums[--j]>nums[lo]){
                if(j == lo) break;
            }
            if(i >= j) break;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            count+=2;
        }
        if(lo!=hi&&nums[lo]!=nums[j]) count+=2;
        int tmp = nums[lo];
        nums[lo] = nums[j];
        nums[j] = tmp;
        return j;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(buffer.readLine());
        String[] strs = buffer.readLine().split(" ");
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = Integer.valueOf(strs[i]);
        }
        QuickSortFindPosition c = new QuickSortFindPosition();
        c.sort(nums,0,n-1);
        System.out.print(c.getCount());
    }
}
