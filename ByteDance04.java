import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:MyIdeaTest
 * @description:统计质数数量
 * @author:JasonYu
 * @date:2019-09-29 20-17
 **/
public class ByteDance04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(countPrimes(n));
        }
    }
    private static int countPrimes(int n){
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim,true);
        for (int i = 2; i < n; i++) {
            if(isPrim[i])
                for(int j = 2*i;j<n;j+=i)
                    isPrim[j]=false;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(isPrim[i])
                count++;
        }
        return count;
    }
}
