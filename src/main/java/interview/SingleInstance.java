package interview;

/**
 * @Description 单例模式
 * @Author Skye
 * @Date 2019/3/14 18:41
 * @Version 1.0
 **/
public class SingleInstance {
    private static SingleInstance  instance= new SingleInstance();
    private SingleInstance(){}
    //饿汉模式
    public SingleInstance getInstance(){
        return instance;
    }
    private static SingleInstance instance2 = null;


    //懒汉模式
    public static SingleInstance getInstance2() {
        if (instance2 == null){
            synchronized (SingleInstance.class){
                instance2 = new SingleInstance();
            }
        }
        return instance2;
    }
}
