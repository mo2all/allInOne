package com.tulingedu.nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description socket
 * @Author Skye
 * @Date 2018/12/17 18:55
 * @Version 1.0
 **/
public class TraditionalSocketDemo {
    public static void main(String[] args) throws IOException {

        ExecutorService threadPool = Executors.newCachedThreadPool();
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("服务器端启动...");
        while (true){
            //获取socket客户端套接字
            Socket socket = serverSocket.accept();
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("有新的客户端连接上来了");
                        InputStream is = socket.getInputStream();
                        byte [] b = new byte[1024];
                        while (true){
                            int data = is.read(b);
                            if (data != -1) {
                                String info = new String(b, 0, data, "GBK");
                                System.out.println(info);
                            }else break;
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });

        }


    }
}
