import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Description
 * @Author Skye
 * @Date 2019/3/16 17:02
 * @Version 1.0
 **/
public class StringTest {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        //请输入：[1, 2, 3, 4, 5]
        String str = buffer.readLine();
        String[] strs = str.substring(str.indexOf("[")+1,str.indexOf("]")).split(",");
        System.out.println(Arrays.toString(strs));

//        String res = str.trim();
//        System.out.println(res+res.length());
    }
}
