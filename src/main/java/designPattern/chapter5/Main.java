package designPattern.chapter5;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/4 19:50
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("start...");
        Singleton obj1  = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2){
            System.out.println("obj1 equal obj2");
        }else {
            System.out.println("obj1 not equal obj2");
        }
        System.out.println("end...");
    }
}
