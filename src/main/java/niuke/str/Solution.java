package niuke.str;

/**
 * @Description
 * @Author Skye
 * @Date 2018/12/9 10:54
 * @Version 1.0
 **/
public class Solution {
    public static String replaceSpace(StringBuffer str) {
        String input = str.toString();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == ' ') result.append("%20");
            else result.append(input.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("12  45");
        String str = buffer.toString();
        System.out.println(buffer.length());
        System.out.println(str.length());
    }
}
