package designPattern.chapter7;

/**
 * @Description Builder模式中的ConcreteBuilder角色，负责实现Builder中生成实例的接口
 * @Author Skye
 * @Date 2019/1/5 10:53
 * @Version 1.0
 **/
public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();
    @Override
    public void makeTitle(String title) {
        buffer.append("========================\n");
        buffer.append("【"+ title+"】\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("*"+str+"\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i ++) {
            buffer.append(" ·"+ items[i] + "\n");
        }
    }

    @Override
    public void close() {
        buffer.append("========================\n");
    }
    public String getResult(){
        return buffer.toString();
    }
}
