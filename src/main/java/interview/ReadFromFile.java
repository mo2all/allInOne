package interview;

import java.io.*;

/**
 * @Description 从磁盘中读取文件
 * @Author Skye
 * @Date 2019/3/12 10:25
 * @Version 1.0
 **/
public class ReadFromFile {
   /* public void readFile(String inputPath,String outPath){
        try {
            FileInputStream reader = new FileInputStream(new File(inputPath));
            FileOutputStream writer = new FileOutputStream(new File(outPath),true);
            byte[] buffer = new byte[10*1024];
            while (reader.read(buffer) != -1){
                writer.write(buffer);
            }
            reader.close();
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {

        }
    }

    public static void main(String[] args) {
        ReadFromFile fromFile = new ReadFromFile();
        fromFile.readFile("D:\\test\\input.txt","D:\\test\\output.txt");
    }*/
    /**
     * 1.从文件中读取：FileInputStream
     * 2.通过InputStreamReader将字符流进行编码的转换
     * 3.写入到文件中：FileOutputStream
     */
   public void inputOutput(String input,String output){
       try {
           FileInputStream fis = new FileInputStream(input);
           InputStreamReader is = new InputStreamReader(fis,"UTF-8");
           BufferedReader in = new BufferedReader(is);
           char[] buffer = new char[128];
           while (in.read(buffer) != -1) {
               System.out.println(buffer);
               FileOutputStream fos = new FileOutputStream(output,true);
               OutputStreamWriter os = new OutputStreamWriter(fos, "UTF-8");
               os.write(buffer);
               os.flush();
           }

       }catch (IOException e){
           e.printStackTrace();
       }finally {

       }
   }

    public static void main(String[] args) {
        ReadFromFile file = new ReadFromFile();
        file.inputOutput("D:\\test\\input.txt","D:\\test\\output.txt");
    }
}
