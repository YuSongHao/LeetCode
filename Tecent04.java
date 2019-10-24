import java.util.Scanner;

/**
 * @program:MyIdeaTest
 * @description:腾讯第四题
 * @author:JasonYu
 * @date:2019-09-01 20-05
 **/
public class Tecent04 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        int[] arr = new int[day];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        int day = 1;
        int[] arr = {5};
        int value = highest(arr);
        System.out.println(value);
    }

    public static int highest(int[] arr){
        if (arr.length ==1)
            return arr[0]*arr[0];
        else {
            int highestValue = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                int sum = arr[i];
                int min = arr[i];
                for (int j = i; j < arr.length; j++) {
                    if(j==i)
                    {
                        int value = arr[j]*arr[j];
                        if (highestValue < value)
                            highestValue = value;
                    }
                    else
                    {
                        min = arr[j] > min ? min : arr[j];
                        sum += arr[j];
                        int value = min * sum;
                        if (highestValue < value)
                            highestValue = value;
                    }
                }
            }
            return highestValue;
        }
    }
}
