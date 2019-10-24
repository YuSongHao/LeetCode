import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * @program:MyIdeaTest
 * @description:小米笔试题02
 * @author:JasonYu
 * @date:2019-09-02 11-15
 **/

public class xiaomi02 {
    public static void main(String[] args) {
        int num = 3;
        int[] arr = {1,7,6};
        System.out.println(leastColor(num,arr));
    }
    public static int leastColor(int num,int [] arr)
    {
        int leastNum = num;
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            ll.add(arr[i]);
        }
        Collections.sort(ll);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int first = arr[i];
                int last = arr[j];
                for (int k = 0; k < ll.size(); k++) {
                    if(ll.get(k)==(last-first))
                    {
                        ll.remove(k);
                        leastNum--;
                        break;
                    }
                }
            }
        }
        return leastNum;
    }
}
