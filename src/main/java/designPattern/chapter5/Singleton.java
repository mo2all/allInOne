package designPattern.chapter5;

/**
 * @Description 单例模式
 * @Author Skye
 * @Date 2019/1/4 19:47
 * @Version 1.0
 **/
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println("start...");
        getInstance();
        System.out.println("end...");
    }
}
