package interview.general;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/29 10:42
 * @Version 1.0
 **/
public class Apple extends Fruit {
    public static Apple newEmptyApple(){
        return new Apple();
    }
    private Apple(){

    }
    protected Apple(int i){

    }
    @Override
    public String toString() {
        return Apple.class.getName();
    }
}
