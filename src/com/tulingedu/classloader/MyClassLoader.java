package com.tulingedu.classloader;

import java.io.*;

/**
 * @Description 自定义类加载器
 * @Author Skye
 * @Date 2018/12/14 21:23
 * @Version 1.0
 **/
public class MyClassLoader extends ClassLoader{

    private String name; // 文件名
    private String path; //文件路径

    public MyClassLoader(String name, String path){
        super(); //默认是系统类加载器是父加载器
        this.name = name;
        this.path = path;
    }
    public MyClassLoader(ClassLoader parent, String name, String path){
        super(parent); //自定义父加载类
        this.name = name;
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = new byte[0];
        try {
            data = readClassFileToByteArray(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.defineClass(name, data, 0, data.length - 1);
    }

    private byte[] readClassFileToByteArray(String name) throws IOException {
        InputStream is = null;
        byte[] returnData = null;
        name.replaceAll("\\.", "/");
        String filePath = this.path + name + ".class";
        File file = new File(filePath);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            is = new FileInputStream(file);
            int temp = 0;
            while ((temp = is.read()) == -1){
                os.write(temp);
            }
            returnData = os.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            is.close();
            os.close();
        }
        return returnData;
    }
}
