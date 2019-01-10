package designPattern.chapter7;

/**
 * @Description Builder模式中的Director角色（监工）
 * @Author Skye
 * @Date 2019/1/5 10:51
 * @Version 1.0
 **/
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{
                "早上好",
                "下午好"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好",
                "晚安",
                "再见"
        });
        builder.close();
    }
}
