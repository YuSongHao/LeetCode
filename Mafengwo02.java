

/**
 * @program:MyIdeaTest
 * @description:马蜂窝笔试题02
 * @author:JasonYu
 * @date:2019-09-23 19-57
 **/
//import java.util.Scanner;
//public class Mafengwo02 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String pre = sc.nextLine();
//        String[] preOrder = pre.split(",");
//        int num = sc.nextInt();
//        System.out.println(findNum(preOrder,num));
//    }
//    public static int findNum(String[] midOrder,int num)
//    {
//        int result = -1;
//        int index = -1;
//        for (int i = 0; i < midOrder.length; i++) {
//            if (Integer.parseInt(midOrder[i])==num)
//                index = i;
//        }
//        if(index == -1)
//            return result;
//        if (2*index+2<midOrder.length)
//            result = Integer.parseInt(midOrder[2*index+2]);
//        return result;
//    }
//}

import java.util.Scanner;
public class Mafengwo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pre = sc.nextLine();
        int num = sc.nextInt();
        String[] preOrder = pre.split(",");
        String[] midOrder = new String[preOrder.length];
        findMidOrder(preOrder,midOrder,0,preOrder.length-1,0,midOrder.length-1);
        for (int i = 0; i < midOrder.length; i++) {
            System.out.print(midOrder[i]+",");
        }

        System.out.println(findNum(midOrder,num));
    }
    public static void findMidOrder(String[] pre,String[] mid,int preLow,int preHigh,int midLow,int midHigh)
    {
        if(preHigh>=preLow)
        {
            mid[(midHigh+midLow)/2] = pre[preLow];
            int temp = (preHigh-preLow)/2;
            findMidOrder(pre,mid,preLow+1,preLow+temp,midLow,midLow+temp-1);
            findMidOrder(pre,mid,preLow+temp+1,preHigh,midLow+temp+1,midHigh);
        }
    }
    public static int findNum(String[] midOrder,int num)
    {   int result = -1;
        for (int i = 0; i < midOrder.length; i++) {
            if (Integer.parseInt(midOrder[i])==num&&i<midOrder.length-1)
                result = Integer.parseInt(midOrder[i+1]);
        }
        return result;
    }
}