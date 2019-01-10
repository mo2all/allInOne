package designPattern.chapter12;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/9 20:29
 * @Version 1.0
 **/
public class UpDownBorder extends Border {

    char upDownChar;
    public UpDownBorder(Display display, char ch) {
        super(display);
        upDownChar = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {//上边框或下边框
        if (row == 0 || (row == display.getRows() + 1)) {
            return makeLine(upDownChar, display.getColumns());
        }else {
            return display.getRowText(row -1);
        }
    }
    private String makeLine(char ch, int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i ++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
