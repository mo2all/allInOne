public class Main {

    public static void main(String[] args) {
        int x = 5;
        x = ++x + x++; // 12
//        x = ++x + ++x;//13
//        x = x++ + ++x;//12
//        x = x + (x++) + (++x); //17
//        x = x + (x++) + (++x) + (++x);//25
        System.out.println(x);
    }
}


