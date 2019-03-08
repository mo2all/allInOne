package concurrent.chapter4.piped;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @Description 管道输入/输出流
 * @Author Skye
 * @Date 2019/1/26 21:50
 * @Version 1.0
 **/
public class Piped {



    public static void main(String[] args) throws Exception {
        PipedReader in = new PipedReader();
        PipedWriter out = new PipedWriter();
        Thread printThread = new Thread(new Print(in),"printThread");
        printThread.start();
        try {
            //将管道连接起来，否则会抛出异常
            out.connect(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int receive = 0;
        try {
            while ((receive = System.in.read()) != -1) {
                out.write(receive);
            }
        }finally {
            out.close();
        }
    }

    static class Print implements Runnable{

        private PipedReader in;
        Print(PipedReader in){
            this.in = in;
        }
        @Override
        public void run() {
            int receive;
            try {
                while ((receive = in.read()) != -1) {
                    System.out.print((char) receive);
                }
            }catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

