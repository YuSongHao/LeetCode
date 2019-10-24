package jason.com.testForIdea;

import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{0,4,0},{4,0,6},{0,6,0}};
        int num = 3;

        System.out.println(douyou(num,arr));
    }
    public static int douyou(int num, int[][] arr)
    {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                if(arr[i][j]>3) {
                    al1.add(i);
                    al2.add(j);
                }
            }
        }
//        int[] arr1 = new int[al1.size()];
//        int[] arr2 = new int[al2.size()];
//        for (int i = 0; i < al1.size(); i++) {
//            arr1[i] = al1.get(i);
//            arr2[i] = al2.get(i);
//        }
        int douyouNumber = 0;
        TreeSet<Integer> ts = new TreeSet<>();

        ArrayList<TreeSet<Integer>> resultList= new ArrayList<TreeSet<Integer>>();
        resultList.add(ts);
        if(al1.size()==0)
            return 0;
        else if(al1.size()== 1)
            return num-1;
        else{
            ts.add(al1.get(0));
            ts.add(al2.get(0));
        }
        for (int i = 1; i < al1.size(); i++) {
            for (int j = 0; j < resultList.size(); j++) {
                ts.add(al1.get(i));
                ts.add(al2.get(i));
                TreeSet<Integer> tse = resultList.get(j);
                if(tse.contains(al1.get(i))||tse.contains(al2.get(i)))
                {
                    tse.add(al1.get(i));
                    tse.add(al2.get(i));

                }
                else{
                    resultList.add(new TreeSet<Integer>());
                    TreeSet<Integer> tsf = resultList.get(resultList.size()-1);
                    tsf.add(al1.get(i));
                    tsf.add(al2.get(i));
                }
            }
        }
        for (int i = 1; i < num; i++) {
            if(!ts.contains(i))
                douyouNumber++;
        }
        douyouNumber += resultList.size();

        return douyouNumber;
    }
    public static void bubbleSort2Arr(int[] arr1, int[] arr2)
    {
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = 0; j < arr1.length-1-i; j++) {
                if(arr1[j]>arr1[j+1])
                {
                    swap(arr1,j,j+1);
                    swap(arr2,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int num1,int num2)
    {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

}
