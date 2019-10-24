/**
 * @program:MyIdeaTest
 * @description:字节跳动史莱姆变形记
 * @author:JasonYu
 * @date:2019-09-11 20-09
 **/
public class ByteDance {
    public static void main(String[] args) {
        int triangle = 10;
        int square = 13;
        int circle = 18;
        System.out.println(transform(triangle,square,circle));
    }
    public static boolean transform(int triangle,int square,int circle)
    {
        int diff_t_s = triangle-square;
        int diff_t_c = triangle-circle;
        int diff_s_c = square-circle;
        if(diff_s_c%3!=0&&diff_t_c%3!=0&&diff_t_s%3!=0)
            return false;
        else
        {
            int[] arr = {triangle,square,circle};
            int tempLow = 0;
            int tempHigh = 0;
            int tempOther = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = i+1; j < 3; j++) {
                    if ((arr[i]-arr[j])%3==0)
                    {
                        tempLow = arr[i]-arr[j]>0?arr[j]:arr[i];
                        tempHigh = arr[i]-arr[j]>0?arr[i]:arr[j];
                        for (int k = 0; k < arr.length; k++) {
                            if (arr[k]!=tempHigh&&arr[k]!=tempLow)
                                tempOther=arr[k];
                        }
                        break;
                    }
                }
            }
            while(tempHigh!=tempLow&&tempOther>0&&tempHigh>0)
            {
                tempHigh--;
                tempOther--;
                tempLow+=2;
            }
            if(tempHigh!=tempLow)
                return false;
            else
            {
                while(tempHigh!=0)
                {
                    tempHigh--;
                    tempLow--;
                    tempOther+=2;
                }
            }
            System.out.println(tempLow);
            System.out.println(tempHigh);
            System.out.println(tempOther);
            return true;
        }

    }
}
