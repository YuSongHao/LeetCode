/**
 * @program:MyIdeaTest
 * @description:
 * @author:JasonYu
 * @date:2019-09-01 22-48
 **/
import java.util.*;
public class deleteShut {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num1 = Integer.parseInt(scanner.nextLine());
//        int num2 = Integer.parseInt(scanner.nextLine());
//        int [] arr = new int[num2];
//        for(int i = 0; i<num2; i++) {
//            arr[i] = scanner.nextInt();
//        }
        int num2 = 8;
        int[] arr = {1,1,1,2,2,3,5,1};
        SeleSort(arr, num2);
        //System.out.println(SeleSort(arr, num2));
    }

    public static void SeleSort(int[] array,int num2) {
        //if(num2 /2 != 0) {
        //return "NO";
        //}
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList <Integer> list = new ArrayList<Integer>();
        //Arrays.sort(array);
        for(int i = 0; i<array.length;i++) {
            if(map.containsKey(array[i])){
                int value = map.get(array[i]);
                map.put(array[i],value+1);
            }else{
                map.put(array[i],1);
            }
        }
        int max = 0;
        int [] a = new int [array.length];
        for(int i=0; i < array.length;i++){
            System.out.println(map.get(array[i]));
            a[i] = map.get(array[i]);
        }
        /* if(max > num2){
             return "NO";
         }else {
             return "YES";
         }*/
    }
}
