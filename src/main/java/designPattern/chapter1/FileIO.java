package designPattern.chapter1;

import java.io.IOException;

/**
 * @Description Targer(对象) 类继承方式
 * @Author Skye
 * @Date 2019/1/4 9:59
 * @Version 1.0
 **/
public interface FileIO {
    void readFromFile(String filename) throws IOException;
    void writeToFile(String filename) throws IOException;
    void setValue(String key, String value);
    String getValue(String key);
}
