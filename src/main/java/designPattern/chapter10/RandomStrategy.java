package designPattern.chapter10;

import java.util.Random;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/6 20:28
 * @Version 1.0
 **/
public class RandomStrategy implements Strategy {
    Random random = new Random();
    RandomStrategy(){

    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }
}
