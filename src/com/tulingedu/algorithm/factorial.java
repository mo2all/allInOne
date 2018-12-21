package com.tulingedu.algorithm;

/**
 * @Description 不丢失精度计算阶乘和n次幂的运算
 * @Author Skye
 * @Date 2018/12/21 8:51
 * @Version 1.0
 **/
public class factorial {
    //计算阶乘
    //使用大数字运算

    public static void main(String[] args) {
        System.out.println("+++++++++++++++华丽的分割线++++++++++++");
        long start = System.currentTimeMillis();
        int[] ints = new int[400];
        int num=200;
        ints[ints.length - 1] = 1;
        for (int i = 1; i <= num; i ++){
            mul(ints,i);
        }
        printValidNumber(ints);
        long stop = System.currentTimeMillis();
        System.out.println("\n运行时间"+(stop - start)+"ms");
        System.out.println("\r\n+++++++++++++++华丽的分割线++++++++++++");
        int[] test = {9,9,9,8,9,7};
        int count = 0;
        int[] result = test;
        //test的x+1次幂运算
        final  int x = 1999;
        while (count < x){
            result   = mul(result,test);
            count ++;
        }
//        int[] result=  mul(test,test);
        System.out.print("数字：");
        printValidNumber(test);
        System.out.print("\n该数字的"+(x+1)+"次幂结果为：");
        printValidNumber(result);
        System.out.println("\n运行时间："+(System.currentTimeMillis() - start)+"s");
        System.out.println("\r\n+++++++++++++++华丽的分割线++++++++++++");
    }

    private static int[] mul(int[] a, int b){
        for (int i = a.length - 1; i > 0; i--){
            a[i] *= b;
        }
        convertOneNum(a);
        return a;
    }
    //从低位到高位进行进位和留位运算
    private static void convertOneNum(int [] a){
        for (int i = a.length-1; i > 0; i--){
            a[i-1]+=a[i]/10;
            a[i] = a[i]%10;
        }
    }

    /**
     * 计算两个用数组保存的数值的的乘积
     * @param a 数组1
     * @param b 数组2
     * @return 返回的结果为数组1和数组2的长度+2的乘积结果数组
     */
    private static int[] mul(int[] a, int[] b){
        int[] result = new int[(a.length+b.length+2)];
        //b为乘数，a为被乘数
        for (int i = b.length-1; i >= 0; i --){
            int current = b[i]; //当前的乘数的值
            //计算当前的乘数和被乘数的积，并将结果存储在result
            for (int j = a.length-1, k = result.length - 1; j >= 0 && k>=0; j--,k--){
                    //k-(b.length - 1 - j)是将乘数和被乘数相乘的结果添加到该位置，例如在百位的时候结果应该从百位开始添加
                    result[k-(b.length - 1 - i)] += current * a[j];
            }
            //对结果进行进位和留位
            convertOneNum(result);
        }
        return result;
    }

    /**
     * 打印数组中的有效数字
     * @param num
     */
    private static void printValidNumber(int[] num){
        boolean isPrint = false;
        int count = 0;
        for (int i = 0; i < num.length; i++){
            if (!isPrint && num[i] != 0){
                isPrint = true;
            }
            if (isPrint){
                count++;
                System.out.print(num[i]);
            }
        }
        System.out.print("\n位数：" +count);
    }
}
