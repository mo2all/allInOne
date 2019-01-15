package interview.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 测试泛型类
 * @Author Skye
 * @Date 2018/12/29 10:45
 * @Version 1.0
 **/
public class Test{
    class Plate<T>{
        private T item;
        public Plate(T item){ this.item = item;}

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }

    //level 1
    class Food{}

    //level 2
    class Meat extends Food{}
    class Fruit extends Food{}

    //level 3
    class Apple extends Fruit{}
    class Banana extends Fruit{}
    class Pork extends Meat{}
    class Beef extends Meat{}

    //level 4
    class RedApple extends Apple{}
    class GreenApple extends Apple{}

    public static void main(String[] args) {
        Test.Plate<? extends Fruit> plate = new Test().new Plate<Apple>(new Test().new Apple());
        Fruit fruit = plate.getItem();

        Test.Plate<? super Fruit> plateSuper = new Test().new Plate<Fruit>(new Test().new Apple());
        plateSuper.setItem(new Test().new Apple());
        plateSuper.setItem(new Test().new Banana());
    }




}
