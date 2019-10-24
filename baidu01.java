

/**
 * @program:MyIdeaTest
 * @description:百度笔试题01
 * @author:JasonYu
 * @date:2019-09-17 19-32
 **/
import java.util.Scanner;
public class baidu01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findTwoChild(n,m,k));
    }
    private static int findTwoChild(int n,int m,int k)
    {
        int a = 0;
        int b = 0;
        int result = 0;
        if (n*m<=k)
            return 0;
        else{
            while((n-a)*(m-b)>k)
            {
                if(n-a>m-b)
                    b++;
                else
                    a++;
            }
            result = a+b;
            return result;
        }
    }
}
