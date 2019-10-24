package test.com;

/**
 * @program:MyIdeaTest
 * @description:美团笔试题01
 * @author:JasonYu
 * @date:2019-09-18 15-58
 **/
public class meituan {
    public static void main(String[] args) {
        int week = 4;
        int []easy = {10,1,10,10};
        int []hard = {5,50,5,1};
        System.out.println(maxValue(easy,hard));
    }
    public static int maxValue(int[] easy,int[] hard)
    {
        int value = 0;
        int [] mission = new int[easy.length];
        for (int i = 1; i < easy.length; i++) {
            if (i<easy.length-1) {
                if (easy[i] + easy[i - 1] < hard[i] && hard[i] > hard[i + 1]) {
                    mission[i] = 1;
                }
            }else
            {
                if (easy[i] + easy[i - 1] < hard[i]) {
                    mission[i] = 1;
                }
            }
        }
        for (int i = mission.length-1;i>=0; i--) {
            if (mission[i]==0)
                value+=easy[i];
            else if (mission[i]==1)
            {
                value+=hard[i];
                i--;
            }
        }
        return value;
    }
}
