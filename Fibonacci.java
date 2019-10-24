/**
 * @program:MyIdeaTest
 * @description:非递归方式实现斐波那契
 * @author:JasonYu
 * @date:2019-08-30 15-18
 **/
public class Fibonacci {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(Fib(n));
    }
    public static int Fib(int n)
    {
        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 1;
        if (n>=2){
            for (int i = 1; i < n; i++) {
                arr[(i+1)%2] = arr[(i+1)%2]+arr[i%2];
            }
        }
        return arr[n%2];
    }
}
