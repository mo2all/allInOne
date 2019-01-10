package designPattern.chapter9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/6 9:34
 * @Version 1.0
 **/
public class FileDisplayImpl extends DisplayImpl {
    private BufferedReader reader;
    private String filename;
    private final int MAX_READ_AHEAD_LIMIT = 1024*4;

    public FileDisplayImpl(String filename){
        this.filename = filename;
    }
    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(MAX_READ_AHEAD_LIMIT);
        }catch (IOException e ){
            e.printStackTrace();
        }
        System.out.println("===================="+filename+"====================");
    }

    @Override
    public void rawPrint() {
     try {
         String line;
         reader.reset(); //回到mark的位置
         while ((line = reader.readLine()) != null){
             System.out.println("> " + line);
         }

     }catch (IOException e){
         e.printStackTrace();
     }

    }

    @Override
    public void rawClose() {
        System.out.println("====================");
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
