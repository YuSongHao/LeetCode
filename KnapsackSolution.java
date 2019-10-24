import jdk.nashorn.api.tree.ImportEntryTree;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.Executor;
/**
 * @program:MyIdeaTest
 * @description:01背包问题的解法
 * @author:JasonYu
 * @date:2019-08-29 21-50
 **/
public class KnapsackSolution {
    private int[][] F;

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String w = sc.nextLine();
//        String[] w1 = w.split(" ");
//        String v = sc.nextLine();
//        String[] v1 =  v.split(" ");
//        int V = sc.nextInt();
//        int[] weight = new int[w1.length];
//        int[] value = new int[v1.length];
//        for (int i = 0; i < w1.length; i++) {
//            weight[i] = Integer.parseInt(w1[i]);
//            value[i] = Integer.parseInt(v1[i]);
//        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            hm.put((i%9),i);
        }
        ArrayList<Integer> al = new ArrayList<>();
        int a = testListIterator(al);
//        int[] weight = {30, 20, 35, 40};
//        int[] value = {20, 18, 25, 30};
//        int N = weight.length;
//        int V = 50;
//        int number = DP_01bag(V, N, weight, value);
//        System.out.println(number);
    }

    /**
     * @description: 01背包问题
     * @Param:[m, n, w, p]
     * @return: int
     * @author: JasonYu
     * @date: 2019-08-29 22:09
     */
    public static int DP_01bag(int m, int n, int w[], int p[]) {
        //c[i][m] 表示前i件物品恰好放入重量为m的背包时的最大价值
        int c[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            c[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                //当物品为i件重量为j时，如果第i件的重量(w[i-1])小于重量j时，c[i][j]为下列两种情况之一：
                //(1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的值
                //(2)物品i放入背包中，则背包剩余重量为j-w[i-1],所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值
                if (w[i - 1] <= j) {
                    if (c[i - 1][j] < c[i - 1][j - w[i - 1]] + p[i - 1]) {
                        c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
                    } else {
                        c[i][j] = c[i - 1][j];
                    }
                } else {
                    c[i][j] = c[i - 1][j];
                }
            }
        }
        return c[c.length - 1][c[0].length - 1];
    }
    /**
     * @description: 测试链表迭代器
     * @Param:[al]
     * @return: int
     * @author: JasonYu
     * @date: 2019-08-30 09:14
     */
    public static int testListIterator(ArrayList<Integer> al)
    {
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        ListIterator<Integer> lit = al.listIterator(al.size());
        int l = 0;
        while(lit.hasPrevious())
        {
            l = lit.previous();
            System.out.println(l+" ");
        }
        return 1;
    }
}
