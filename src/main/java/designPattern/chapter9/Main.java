package designPattern.chapter9;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d5 = new CountDisplay(new FileDisplayImpl("start.txt"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        d4.display();
        d4.multiDisplay(3);
        d4.randomDisplay(10);
        d5.multiDisplay(5);

        IncreaseDisplay increaseDisplay1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'),1);
        IncreaseDisplay increaseDisplay2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'),2);
        increaseDisplay1.increaseDisplay(4);
        increaseDisplay2.increaseDisplay(6);
    }
}
