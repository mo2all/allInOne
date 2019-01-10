package designPattern.chapter7;

/**
 * @Description Builder模式中的Client角色
 * @Author Skye
 * @Date 2019/1/5 10:50
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director directorForTextBuilder = new Director(textBuilder);
        directorForTextBuilder.construct();
        String result = textBuilder.getResult();
        System.out.println(result);

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director directorForHtmlBuilder = new Director(htmlBuilder);
        directorForHtmlBuilder.construct();
        String result2 = htmlBuilder.getResult();
        System.out.println(result2);
    }
}
