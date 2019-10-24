package jason.com.jdtest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Solution02 {
    public static void main(String[] args) {
        int num = 10, relationship = 5;
        int[] boys = {1,5,1,3};
        int[] girls = {6,6,4,4};
        int m = 0;
        m = minRemove(boys,girls,m);
        System.out.println(m+" ");
    }
    public static int minRemove(int[] boys,int[] girls,int m)
    {
        if(boys.length == 0)
            return m;
        else{
            int[] arr = new int[2];
            bubbleSrotTwoArrays(boys,girls);
            findMostFirend(boys,girls);
            arr = findMostFirend(boys,girls);
            int[] newBoys = new int[boys.length-arr[1]];
            int[] newGirls = new int[girls.length-arr[1]];
            int j = 0;
            for (int i = 0; i < boys.length; i++) {
                if(boys[i] != arr[0])
                {
                    newBoys[j] = boys[i];
                    newGirls[j] = girls[j];
                    j++;
                }
            }
            m++;
            return minRemove(newBoys,newGirls,m);
        }
    }
    public static int[] findMostFirend(int[] boys,int[] girls){
        Map<Integer,List<Integer>> hm = new LinkedHashMap<>();
        for (int i = 0; i < boys.length; i++) {
            if(hm.containsKey(boys[i]))
            {
                List<Integer> value = hm.get(boys[i]);
                value.add(girls[i]);
                hm.put(boys[i],value);
            }
            else {
                List<Integer> value = new ArrayList<>();
                value.add(girls[i]);
                hm.put(boys[i], value);
            }
        }
        Map<Integer,List<Integer>> gm = new LinkedHashMap<>();
        for (int i = 0; i < girls.length; i++) {
            if(gm.containsKey(girls[i]))
            {
                List<Integer> value = gm.get(girls[i]);
                value.add(boys[i]);
                gm.put(girls[i],value);
            }
            else {
                List<Integer> value = new ArrayList<>();
                value.add(boys[i]);
                gm.put(girls[i], value);
            }
        }
        Iterator<Map.Entry<Integer,List<Integer>>> iterator = hm.entrySet().iterator();
        int number = 0,times = 0;
        while(iterator.hasNext())
        {
            Map.Entry<Integer, List<Integer>> entry = iterator.next();
            Integer key = entry.getKey();
            List<Integer> value = entry.getValue();
            if(value.size()>times)
            {
                number = key;
                times = value.size();
            }
        }
        Iterator<Map.Entry<Integer,List<Integer>>> it = gm.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer, List<Integer>> entry = it.next();
            Integer key = entry.getKey();
            List<Integer> value = entry.getValue();
            if(value.size()>times)
            {
                number = key;
                times = value.size();
            }
        }
        int[] result = new int[2];
        result[0] = number;
        result[1] = times;
        return result;
    }
    public static void bubbleSrotTwoArrays(int[] boys,int[] girls)
    {
        for (int i = 0; i < boys.length-1; i++) {
            for (int j = 0; j < boys.length-1-i; j++) {
                if(boys[j]>boys[j+1])
                {
                    swap(boys,j,j+1);
                    swap(girls,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int pos1,int pos2)
    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

}
