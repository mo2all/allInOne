package interview;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/28 19:50
 * @Version 1.0
 **/
public class User {
    public  <T> T print(T t){
        return t;
    }

    public static void main(String[] args) {
        System.out.println(new User().print(new Node(5)));
    }
}
