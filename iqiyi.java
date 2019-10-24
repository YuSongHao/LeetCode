import java.util.Scanner;

/**
 * @program:MyIdeaTest
 * @description:概率题
 * @author:JasonYu
 * @date:2019-09-08 16-15
 **/
public class iqiyi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int blue = sc.nextInt();
        double Awin = findAwin(red,blue);
        System.out.println(Awin);
        System.out.println(allConditions(red,blue));

    }
    public static double findAwin(int red,int blue)
    {
        double result = 0.0;
        int length = red+blue;
        int allCondition = allConditions(red,blue);
        int Awins = 0;
        for (int i = 1; i < length+1; i++) {
            if((i%3)==1){
                int tempblue = blue-(int)Math.ceil(i/3);
                int tempred = red-1;
                Awins += allConditions(tempred,tempblue);
            }
        }
        result = Awins/length;
        return result;
    }
    public static int allConditions(int red,int blue)
    {
        if(red<=0||blue<=0)
            return 0;
        int num = 1;
        int den = red+blue;
        for (int i = 1 ;i <= red; i++) {
            num = num*(i+1);
            den = den*(red+blue-i-1);
        }
        return den/num;
    }
}
