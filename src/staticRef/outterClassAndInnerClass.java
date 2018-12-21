package staticRef;

/**
 * @Description
 * @Author Skye
 * @Date 2018/11/21 21:01
 * @Version 1.0
 **/
public  class outterClassAndInnerClass {
    public static String msg;
    static {
        msg = "good job, my friend";
    }
    public void method(){
        System.out.println("i am a normal method");
    }
    public static void staticMethod(){
        System.out.println("i am a static method");
    }
    public static class staticInnerClass{
       public static void staticPrint(){
           System.out.println("I am static inner class static inner method, msg ="+ msg );
        }
        public  void print(){
            System.out.println("I am static inner class inner method, msg ="+ msg );
        }

    }
    public class InnerClass{
        public void display(){
            System.out.println("I am inner class , msg ="+msg);
            method();
        }
    }

}
class Main{
    public static void main(String[] args){
        //创建静态内部类的实例
        outterClassAndInnerClass.staticInnerClass staticInnerClass = new outterClassAndInnerClass.staticInnerClass();
        staticInnerClass.print();
        outterClassAndInnerClass.staticInnerClass.staticPrint();
        //创建普通的内部类
        outterClassAndInnerClass.InnerClass innerClass = new outterClassAndInnerClass().new InnerClass();
        innerClass.display();
    }
}

