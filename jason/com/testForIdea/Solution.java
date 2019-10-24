package jason.com.testForIdea;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {234234,233,445,6,3452,231514,4652,23414};
        quickSort(arr,0,arr.length-1);
    }
    public static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr,int low, int high)
    {
        if(low >= high){
            return;
        }
        int mid = getMiddle(arr,low,high);
        quickSort(arr,low,mid-1);
        quickSort(arr,mid+1,high);
    }
    public static int getMiddle(int[] arr,int low, int high)
    {
        int temp = arr[low];
        while (low<high)
        {
            while(low<high && arr[high]>=temp)
            {
                high--;
            }
            arr[low] = arr[high];

            while(low<high && arr[low]<= temp)
            {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }
}
