package base.io;

import java.io.File;

/**
 * @Description 遍历目录以及子目录
 * @Author Skye
 * @Date 2019/3/15 11:07
 * @Version 1.0
 **/
public class FileUtils {
    private FileUtils(){}
    public static void listDirectory(File file){
        if (!file.exists()) {throw new IllegalArgumentException("目录不存在");}
        if (!file.isDirectory()) throw new IllegalArgumentException("不是目录");
        File[] files = file.listFiles();
        for (File item :
                files) {
            if (item.isDirectory()){
                listDirectory(item);
            }else System.out.println(item.getAbsoluteFile());
        }
    }

    public static void main(String[] args) {
        FileUtils.listDirectory(new File("G:\\wampdemo"));
    }
}
