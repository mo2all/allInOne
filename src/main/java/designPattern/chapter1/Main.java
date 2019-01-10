package designPattern.chapter1;

import java.io.IOException;

/**
 * @Description client（请求者）
 * @Author Skye
 * @Date 2019/1/4 10:03
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year","2019");
            f.setValue("month","1");
            f.setValue("day", "4");
            f.writeToFile("newFile.txt");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
