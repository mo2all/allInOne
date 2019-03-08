import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/16 16:51
 * @Version 1.0
 **/
public class test2 {
    public int NumberOf1Between1AndN_Solution(int n) {

        int count = 0;
        String str = null;
        for(int i = n; i > 0;i--){
            str = String.valueOf(n);
            for (int j = 0;j < str.length();j++)
            {
                if (str.charAt(i)=='1') count++;
            }
        }
        return count;
    }

    public int[] deleteMoreDouble(int[] arr){
        int i=0;
        int count =0;
        for (int j =0; j < arr.length;j ++) {
            if (arr[j] == arr[i]) count ++;
            if (arr[j] != arr[i]&&count<=2) {
                i ++;
            }

        }
        return null;
    }
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> >  resultList = new ArrayList<>();
        for (int n = 2;n < (sum/2+2);n++ ){

            double tmp = (double)sum*2/n;
            int da0=-1;
            if ((2*sum/n)-tmp == 0){
                da0 = (int)(tmp - (n-1));
            }
            double d2 = (double)da0/2;
            if (da0>0 && (da0/2-d2)==0) {
                da0 = (int)d2;
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0;i < n;i++) {
                    list.add(da0+i);
                }
                resultList.add(list);
            }
        }
        Collections.sort(resultList, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        return resultList;
    }

    public static void main(String[] args) {
        double n = (double) 5/2;
        boolean b = (4/2 -n == 0);
    }
}
