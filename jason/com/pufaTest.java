package jason.com;
import java.lang.Math;
public class pufaTest {
    public static void main(String[] args) {
//        System.out.println(monkey(10,1));
        System.out.println(isPow(-1));
        System.out.println(numberOfword("于嵩浩,"));
    }
    public static int numberOfword(String s){
        return s.length();
    }
    public static boolean isPow(int num){
        return Math.sqrt(num)==(int)(Math.sqrt(num));
    }
    public static int monkey(int day,int remain)
    {
        int result = 0;
        result+=remain;
        while(day!=1)
        {
            result+=1;
            result*=2;
            day--;
        }
        return result;
    }
}
