import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program:MyIdeaTest
 * @description:最接近的三数之和
 * @author:JasonYu
 * @date:2019-09-16 14-38
 **/
public class leetcode16 {
    public static void main(String[] args) {
        int [] arr1 = {-1,2,1,-4};
        int target = 1;
        int maxValue = Integer.MAX_VALUE;
        String str = "";
        while(maxValue!=0)
        {
            str+=maxValue&1;
            maxValue=maxValue>>1;
        }
        if (str.length()<32)
            str = "0"+str;
        //System.out.println(threeSumClosest(arr1,target));
        System.out.println(str);
        int []res = transform(5);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    private static int threeSumClosest(int[] arr,int target)
    {
        Arrays.sort(arr);
        int start = arr[0];
        int end = arr[arr.length-1];
        int mid = start;
        for (int i = 0; i < arr.length; i++) {

        }
        return 0;
    }
    private static int[] transform(int x)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            al.add(i);
        }
        Integer[] arr = (Integer[])al.toArray(new Integer[al.size()]);
        int[] arr2 = Arrays.stream(arr).mapToInt(Integer::valueOf).toArray();
        return arr2;
    }
}
