package interview.campus2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Description 字符串的价值
 * @Author Skye
 * @Date 2019/3/15 17:24
 * @Version 1.0
 **/
public class StringValue {
    //使用最大堆 排序完成操作
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String str = buffer.readLine();
        int k = Integer.valueOf(buffer.readLine());
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            }else map.put(key,1);
        }
        Collection<Integer> values = map.values();
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (Integer value :
                values) {
            queue.add(value);
        }
        while (k > 0){
            queue.add(queue.poll()-1);
            k--;
        }
        Object[] res = queue.toArray();
        int sum=0;
        for (Object item : res){
            sum+= (Integer) item*(Integer) item;
        }
        System.out.println(sum);
    }
}
