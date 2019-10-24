/**
 * @program:MyIdeaTest
 * @description:华为笔试题02
 * @author:JasonYu
 * @date:2019-09-25 19-12
 **/
import java.util.ArrayList;
import java.util.Scanner;
public class HUAWEI02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] nums = num.split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int[] arr = new int[n];
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        String[] nextLines = new String[m];
        for (int i = 0; i < m; i++) {
            nextLines[i] = sc.nextLine();
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] ch = nextLines[i].split(" ");
            if (ch[0].equals("Q"))
            {
                al.add(query(arr,Integer.parseInt(ch[1]),Integer.parseInt(ch[2])));
            }
            if(ch[0].equals("U"))
            {
                int index = Integer.parseInt(ch[1])-1;
                int value = Integer.parseInt(ch[2]);
                arr[index] += value;
            }
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
    public static int query(int[] arr,int a,int b) {
        int result = 0;
        if(a>b)
        {
            int temp = a;
            a=b;
            b=temp;
        }
        for (int i = a - 1; i < b; i++) {
            result += arr[i];
        }

        return result / (b - a + 1);
    }
}
