import java.util.Scanner;

/**
 * @program:MyIdeaTest
 * @description:腾讯笔试题01
 * @author:JasonYu
 * @date:2019-09-01 20-57
 **/
public class Tecent01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int box = sc.nextInt();
//        int key = sc.nextInt();
//        int[] arrBox = new int[box];
//        int[] arrKey = new int[key];
//        for (int i = 0; i < box; i++) {
//            arrBox[i] = sc.nextInt();
//        }
//        for (int i = 0; i < key; i++) {
//            arrKey[i] = sc.nextInt();
//        }
        int box = 3;
        int key = 2;
        int[] arrBox = {1,2,3};
        int[] arrKey = {2,1};
        System.out.println(treasure(box,key,arrBox,arrKey));
    }
    public static int treasure(int box,int key,int[] arrBox,int[] arrKey)
    {
//        int result = 0;
//        int restBox = box;
//        int restKey = key;
//        for (int i = 0; i < box; i++) {
//            for(int j = 0;j<key;j++) {
//                if (arrKey[j] == -1)
//                    continue;
//                if ((arrBox[i] + arrKey[j]) % 2 == 1) {
//                    restBox--;
//                    restKey--;
//                    result++;
//                    arrBox[i] = -1;
//                    arrKey[j] = -1;
//                    continue;
//                }
//            }
//        }
//        return result;
        int result = 0;
        if(box>key) {
            int oddKey = 0;
            int evenKey = 0;
            for (int i = 0; i < key; i++) {
                if (arrKey[i] % 2 == 1)
                    oddKey++;
                else
                    evenKey++;
            }
            for (int i = 0; i < box; i++) {
                if ((arrBox[i] % 2) == 1 && evenKey != 0)
                    evenKey--;
                else if((arrBox[i] % 2) == 0 && oddKey != 0)
                    oddKey--;
            }
            return key - (evenKey + oddKey);
        }
        else
        {
            int oddBox = 0;
            int evenBox = 0;
            for (int i = 0; i < box; i++) {
                if (arrKey[i] % 2 == 1)
                    oddBox++;
                else
                    evenBox++;
            }
            for (int i = 0; i < key; i++) {
                if ((arrKey[i] % 2) == 1 && evenBox != 0)
                    evenBox--;
                else if ((arrKey[i] % 2) == 1 && evenBox != 0)
                    oddBox--;
            }
            return box - (evenBox + oddBox);
        }
    }
}
