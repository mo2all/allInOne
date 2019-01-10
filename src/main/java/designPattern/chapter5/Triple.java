package designPattern.chapter5;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 生成一定数量的实例
 * @Author Skye
 * @Date 2019/1/4 20:10
 * @Version 1.0
 **/
public class Triple {
    private static Map<Integer, Triple> map = new HashMap<>();
    private static int instanceNum = 3;

    private Triple(){
        System.out.println("创建了一个实例");
    }
    public static Triple getInstance(int id) {
        if (id > instanceNum-1 || id < 0) throw  new RuntimeException("instance num can't bigger than "+instanceNum);
        if (map.containsKey(id)) return map.get(id);
        else {
            Triple triple = new Triple();
            map.put(id, triple);
            return triple;
        }
    }

    public static void main(String[] args) {
        System.out.println("start...");
        Triple triple2 = Triple.getInstance(2);
        Triple triple0 = Triple.getInstance(0);
        Triple triple1 = Triple.getInstance(1);
        Triple triple21= Triple.getInstance(2);
        System.out.println(triple2 == triple21);
        System.out.println("end...");

    }
}
