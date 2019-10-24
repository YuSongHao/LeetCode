import java.util.Scanner;

/**
 * @program:MyIdeaTest
 * @description:快手笔试题03
 * @author:JasonYu
 * @date:2019-09-16 20-52
 **/
public class kuaishou03
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static int sub2Arr(int[] arr)
    {
        int sum = sum(arr);
        return 0;
    }
    public static int sum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
