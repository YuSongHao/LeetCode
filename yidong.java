/**
 * @program:MyIdeaTest
 * @description:中国移动笔试题
 * @author:JasonYu
 * @date:2019-09-11 16-16
 **/
import java.util.ArrayList;
import java.util.Scanner;
public class yidong {
    public static void main(String[] args) {
//        int n = 10;
//        int k = 3;
//        int m = 2;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        al = LastRemaining_Solution(n,k,m);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
    public static ArrayList<Integer> LastRemaining_Solution(int n, int k,int m) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(i+1);
        }
        int index = -1;
        while (data.size() > m) {
            index = (index + k) % data.size();
            data.remove(index);
            index--;
        }
        return data;
    }
}
