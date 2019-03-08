package niuke.interivew;

/**
 * @Description 给一个序列P和一个整数K，求子串元素和是K的倍数的子串的最大的长度，利用同余定理
 * @Author Skye
 * @Date 2019/2/22 9:13
 * @Version 1.0
 **/
public class MaxLenOfSubSeqSub {
    public int max(int[] nums,int k){

        int[] sums = new int[nums.length+1];
        //存放同余的最大下标和最小下标
        int[] max = new int[k];
        int[] min = new int[k];
        sums[0] = 0;
        //前缀和
        for (int i = 1;i < sums.length; i++) {
            sums[i] = sums[i-1] + nums[i-1];
        }
        for (int i = 0; i < k; i++) {
            max[i] = -1;
            min[i] = k;
        }

        //计算同余的最大下标和最小下标
        for (int i = 0; i < sums.length; i ++) {
            int mod = sums[i]%k;
            //将同余下标的最大值放入max[mod],最小值放入min[mod]中
            if (max[mod] < i) max[mod] = i;
            if (min[mod] > i) min[mod] = i;
        }
        int count = 0;
        for (int i = 0; i < k; i ++) {
            if (max[i] != -1 && min[i] != k) {
                int res = max[i] - min[i];
                if (count < res) count = res;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxLenOfSubSeqSub c = new MaxLenOfSubSeqSub();
        int res = c.max(new int[]{1,2,3,4,5,6}, 5);
        System.out.println(res);

    }
}
