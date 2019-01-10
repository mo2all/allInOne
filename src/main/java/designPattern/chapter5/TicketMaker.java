package designPattern.chapter5;

/**
 * @Description 单例模式
 * @Author Skye
 * @Date 2019/1/4 20:06
 * @Version 1.0
 **/
public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;
    private TicketMaker(){
        System.out.println("produce an instance");
    }
    public int getTicketNumber(){
        return ticket++;
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public static void main(String[] args) {
        System.out.println("start...");
        for (int i = 0; i < 10; i++){
            System.out.println(i+":"+TicketMaker.getInstance().getTicketNumber());
        }
        System.out.println("end...");
    }
}

