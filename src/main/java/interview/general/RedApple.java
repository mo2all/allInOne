package interview.general;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/29 10:43
 * @Version 1.0
 **/
public class RedApple extends Apple{
    RedApple(int i){
        super(i);
    }
    @Override
    public String toString() {
        return RedApple.class.getName();
    }
}
