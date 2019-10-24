import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program:MyIdeaTest
 * @description:华为笔试题03
 * @author:JasonYu
 * @date:2019-09-25 19-39
 **/
public class HUAWEI03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int len = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                al.add(sc.nextInt());
            }
            listAll.add(al);
        }
        int[][] result = power(listAll);
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j < result[j].length; j++) {
                System.out.print(result[j]+" ");
            }
            System.out.println("");
        }
    }
    public static int[][] power(ArrayList<ArrayList<Integer>> listAll)
    {
        int[][] al = new int[listAll.size()][2];
        for (int i = 0; i < listAll.size(); i++) {
            ArrayList<Integer> list = listAll.get(i);
            int[] arr = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                arr[j] = list.get(j);
            }
            al[i]= eachPower(arr);
        }
        return al;
    }
    public static int[] eachPower(int [] arr)
    {
        int[] power = new int [arr.length];
        int[] result = new int [2];
        int max = 0;
        for (int i = 1; i < power.length; i++) {
            int temp = power[i-1];
            for (int j = i-1; j>=0;j-- ) {
                if (arr[j]>arr[i])
                    temp+=1;
                else if(arr[j]<arr[i])
                    temp-=1;
            }
            arr[i] =temp;
            max = max>arr[i]?max:arr[i];
        }
        result[0] = max;
        result[1] = arr[arr.length-1];
        return result;
    }
}

