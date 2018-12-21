package com.tulingedu.classloader;

/**
 * @Description 类加载器的类型
 * @Author Skye
 * @Date 2018/12/14 19:43
 * @Version 1.0
 **/
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Demo2.class.getClassLoader());
        ClassLoader loader = Demo2.class.getClassLoader();
        while (loader != null){
            System.out.println(loader);
            loader = loader.getParent();
        }
    }
}
