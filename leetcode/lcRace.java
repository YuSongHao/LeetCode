package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program:MyIdeaTest
 * @description:
 * @author:JasonYu
 * @date:2019-09-25 15-38
 **/
public class lcRace {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{1,3}};
        int k = 2;
//        int[][] matrix ={{1,5,9},{10,11,13},{12,13,15}};
//        int k = 8;
        System.out.println(kthSmallest(matrix,k));
    }
    public static int kthSmallest(int[][] matrix, int k) {
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (pq.size()<k)
                    pq.add(matrix[i][j]);
                else
                {
                    if (pq.peek()>=matrix[i][j]) {
                        pq.poll();
                        pq.add(matrix[i][j]);
                    }
                }
            }
        }
        result = pq.poll();
        return result;
    }
}
