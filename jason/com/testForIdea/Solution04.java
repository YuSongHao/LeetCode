package jason.com.testForIdea;
import java.util.ArrayList;

public class Solution04 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
//        ListNode t1 = linkedArr(arr);
//        while(t1!=null)
//        {
//            System.out.print(t1.val+" ");
//            t1 = t1.next;
//        }
        int[] boys = {1,2,3,4,1};
        int[] girls = {6,5,5,5,5};
        //ArrayList<Integer> al = new ArrayList<>();
        bubbleSort2Arr(boys,girls);
        for (int i = 0; i < boys.length; i++) {
            System.out.println(boys[i]+" "+girls[i]);
        }
    }
    public static ListNode linkedArr(int[] arr)
    {
        ListNode t1 = new ListNode(arr[0]);
        ListNode curr = t1;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return t1;
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
