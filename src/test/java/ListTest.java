/**
 * @Description
 * @Author Skye
 * @Date 2019/3/7 19:51
 * @Version 1.0
 **/
import java.util.*;

public class ListTest {
    /**
     * 将参数中的偶数全部过滤掉，只留下奇数
     * @param list
     */
    public void foo (List<Integer> list) {
//        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < list.size();i ++){
            if(list.get(i)%2 != 0){
                System.out.print(i == list.size()-1 ? list.get(i) : list.get(i) + ",");
            }

        }
//        for(int i = 0; i < res.size();i ++){
//            System.out.print(i == res.size()-1 ? res.get(i) : res.get(i) + ",");
//        }
    }
    public int search (List<Integer> list, int key) {
        int lo = 0,hi =list.size()-1;
        while(list.get(lo) <= list.get(hi)){
            int mid = lo + (hi-lo)/2;
            if (list.get(mid) == key){
                return key;
            }else if (list.get(mid) < key){
                lo = mid;
            }else {
                hi = mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        ListTest c = new ListTest();
        ArrayList list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(7);
        c.foo(list);
    }


}