package spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description 测试Spring Bean
 * @Author Skye
 * @Date 2018/12/23 8:56
 * @Version 1.0
 **/

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
       CDPlayer cdPlayer = applicationContext.getBean(CDPlayer.class);
       cdPlayer.play();
    }
}
