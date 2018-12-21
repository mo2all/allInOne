package niuke.offer;

/**
 * @Description 斐波那契数列
 * @Author Skye
 * @Date 2018/12/9 21:41
 * @Version 1.0
 **/
public class FibonacciSolution {

    public int Fibonacci(int n) {
        if (n == 0) return 0;
        int[] fibonacci = new int[n+1];
        return getFibonacci(fibonacci, n);
    }
    private int  getFibonacci(int[] a, int n){
        if (n == 1) {
            a[1] = 1;
            return a[1];
        }
        if (n == 2) {
            a[2] = 1;
            return a[2];
        }
        a[n] = getFibonacci(a, n-1) + getFibonacci(a, n-2);
        return a[n];
    }

    public static void main(String[] args) {
        FibonacciSolution solution = new FibonacciSolution();
        int result = solution.Fibonacci(6);
        System.out.println(result);
    }
}
