package designPattern.chapter7;

/**
 * @Description Builder模式中的Builder角色，负责定义生成实例的接口
 * @Author Skye
 * @Date 2019/1/5 10:52
 * @Version 1.0
 **/
public abstract class   Builder {

     private boolean initialized = false;

     abstract void makeTitle(String title); // 修改为可见性为public，并且initialized为false时执行，并且将其设置为true，并在其他方法检查是否为true
     abstract void makeString(String str);
     abstract void makeItems(String[] items);
     abstract void close();

//     abstract void buildTitle();
//     abstract void buildString();
//     abstract void buildItems();
//     abstract void buildDone();

}
