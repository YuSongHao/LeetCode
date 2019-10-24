package jason.com.leetcode.heap.Solution1021;

public class Solution155 {

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(1);ms.push(-10);ms.push(-20);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());


    }
}
