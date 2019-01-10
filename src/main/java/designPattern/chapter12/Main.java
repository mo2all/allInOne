package designPattern.chapter12;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 = 
                    new SideBorder(
                        new FullBorder(
                            new FullBorder(
                                new SideBorder(
                                    new FullBorder(
                                        new StringDisplay("你好，世界。")
                                    ),
                                    '*'
                                )
                            )
                        ),
                        '/'
                    );
        b4.show();
        Display b2_1 = new UpDownBorder(b1,'-');
        Display b3_1 = new SideBorder(b2_1, '*');
        Display b4_2 = new FullBorder(
                new UpDownBorder(
                        new SideBorder(
                                new UpDownBorder(
                                        new SideBorder(
                                                new StringDisplay("你好，世界"), '*'
                                        ), '='
                                ),'|'
                        ),'/')
        );
        b2_1.show();
        b3_1.show();
        b4_2.show();
    }
}
