

/**
 * @program:MyIdeaTest
 * @description:电信云计算
 * @author:JasonYu
 * @date:2019-09-18 20-56
 **/
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class DianXinCloud {
    public static void main(String[] args) {
        System.out.println(taskDistribution(10,7,6));
    }
    public static int taskDistribution(int time1,int time2,int num)
    {
        int[] charge = new int[2];
        if (num <2)
            return -1;
        else
        {
            if (time1<time2) {
                charge[0] = time1;
                charge[1] = time2;
            }else
            {
                charge[0] = time2;
                charge[1] = time1;
            }
            num = num - 2;
            int c1 = charge[0];
            int c2 = charge[1];
            while(num>0)
            {
                if (charge[0]+c1>charge[1]+c2)
                    charge[1]+=c2;
                else
                    charge[0]+=c1;
                num--;
            }
        }
        return Math.max(charge[0],charge[1]);
    }
}
