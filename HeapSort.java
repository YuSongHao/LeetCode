import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * @program:MyIdeaTest
 * @description:堆排序
 * @author:JasonYu
 * @date:2019-09-22 19-41
 **/
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {123,230,23912,3231325,532141,434123,5233223,654,3223,52113};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void heapSort(int[] arr)
    {
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a-b;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            ts.add(arr[i]);
        }
        Iterator<Integer> it = ts.iterator();
        int index = 0;
        while(it.hasNext()&&index<arr.length)
        {
            arr[index] = (Integer)it.next();
            index++;
        }
    }
}
