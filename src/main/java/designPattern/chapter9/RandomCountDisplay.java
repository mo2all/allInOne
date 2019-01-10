package designPattern.chapter9;

import java.util.Random;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/6 9:21
 * @Version 1.0
 **/
public class RandomCountDisplay extends CountDisplay {
    Random random = new Random();
    public RandomCountDisplay(DisplayImpl impl){
        super(impl);
    }
    void randomDisplay(int times){
        multiDisplay(random.nextInt(times));
    }

}
