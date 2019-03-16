import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author Skye
 * @Date 2019/3/14 21:18
 * @Version 1.0
 **/
public class test11 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String str = buffer.readLine();
        Set<Character> set = new HashSet<>();
        StringBuffer res = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(set.add(str.charAt(i))) res.append(str.charAt(i));
        }
        System.out.print(res.toString());
    }
}
