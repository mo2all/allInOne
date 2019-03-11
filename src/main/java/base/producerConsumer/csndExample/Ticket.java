package base.producerConsumer.csndExample;

import java.util.Date;

/**
 * @Description 车票
 * @Author Skye
 * @Date 2019/3/10 15:19
 * @Version 1.0
 **/
public class Ticket {
    private String place; //地点
    private Date date;//日期
    private int number;//数量
    private boolean empty = true;//是否为空

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
