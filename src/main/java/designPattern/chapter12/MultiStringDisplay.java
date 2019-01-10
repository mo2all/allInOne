package designPattern.chapter12;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/9 21:05
 * @Version 1.0
 **/
public class MultiStringDisplay extends Display {
    private  int maxLength;
    private List<String> list = new ArrayList<>();
    public MultiStringDisplay() {
        maxLength =0;

    }

    public void add(String string) {
        if (string.length() > maxLength) maxLength = string.length();
        list.add(string);
    }
    @Override
    public int getColumns() {
        return maxLength;
    }

    @Override
    public int getRows() {
        return list.size();
    }

    @Override
    public String getRowText(int row) {
        int currentLength = list.get(row).length();
        if ( currentLength < maxLength) {
            return list.get(row) + addBlank(maxLength - currentLength);
        }else return list.get(row);

    }
    private String addBlank(int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("早上好。");
        md.add("下午好。");
        md.add("晚安，再见。");
        Display d1 = new SideBorder(md, '#');
        Display d2 = new FullBorder(md);
        d1.show();
        d2.show();
    }

}
