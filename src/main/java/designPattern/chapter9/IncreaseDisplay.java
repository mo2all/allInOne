package designPattern.chapter9;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/6 10:29
 * @Version 1.0
 **/
public class IncreaseDisplay extends CountDisplay {
    private int step;
    IncreaseDisplay(DisplayImpl impl, int step){
        super(impl);
        this.step = step;
    }
    public void increaseDisplay(int level){
        int count = 0;
        for (int i = 0; i < level; i ++) {
            multiDisplay(count);
            count += step;
        }
    }
}
