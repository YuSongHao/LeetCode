package jason.com.leetcode.heap.Solution1021;

public class Solution232 {

    public static void main(String[] args){
        MyQuene obj = new MyQuene();
        obj.push(1);
        int param_3 = obj.peek();
        int param_2 = obj.pop();

        boolean param_4 = obj.empty();
        System.out.println(param_4);
    }
}
