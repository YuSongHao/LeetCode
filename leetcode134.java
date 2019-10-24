/**
 * @program:MyIdeaTest
 * @description:加油站问题
 * @author:JasonYu
 * @date:2019-09-18 14-55
 **/
public class leetcode134 {
    public static void main(String[] args) {
        int [] gas  = {5,1,2,3,4};
        int [] cost = {4,4,1,5,1};
//        int [] gas  = {1,2,3,4,5};
//        int [] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas,int[] cost)
    {
        int result = -1;
        for (int i = 0; i < gas.length; i++) {
            int temp = 0;
            for (int j = i; j < i+gas.length; j++) {
                int tempIndex = j;
                if (tempIndex>=gas.length)
                    tempIndex-=gas.length;
                temp = temp+gas[tempIndex]-cost[tempIndex];
                if (temp<0)
                    break;
            }
            if (temp>=0)
            {
                result = i;
                break;
            }
        }
        return result;
    }
}
