package designPattern.chapter3;

import designPattern.chapter3.framework.Factory;
import designPattern.chapter3.framework.Product;
import designPattern.chapter3.idcard.IdCardFactory;

/**
 * @Description 测试
 * @Author Skye
 * @Date 2019/1/4 19:03
 * @Version 1.0
 **/
public class Main {


    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();

    }
}
