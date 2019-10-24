import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program:MyIdeaTest
 * @description:前K个最大值
 * @author:JasonYu
 * @date:2019-09-20 11-24
 **/
public class TopK {
    public static void main(String[] args) {
        int[] arr = {10,3,-2,15,23,78,98,123,-231};
        ArrayList<Integer> al = topK(arr,3);
        System.out.println(al);
    }
    private static ArrayList<Integer> topK(int[] arr,int k){
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a-b;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            if (pq.size()<k)
                pq.add(arr[i]);
            else if(arr[i]>pq.peek())
            {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while(pq.size()!=0)
        {
            res.add(pq.peek());
            pq.remove();
        }
        return res;
    }
}
