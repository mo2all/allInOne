package designPattern.chapter1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * @Description adapater（适配器）
 * @Author Skye
 * @Date 2019/1/4 10:04
 * @Version 1.0
 **/
public class FileProperties extends Properties implements FileIO {


    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(filename);
        load(inputStream);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream(filename);
        String comments = "written by FileProperties";
        store(outputStream,comments);

    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
