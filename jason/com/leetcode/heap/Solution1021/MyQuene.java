package jason.com.leetcode.heap.Solution1021;
import java.util.Stack;
public class MyQuene {
    Stack<Integer> stackPush;
    Stack<Integer> stackPop;
    /** Initialize your data structure here. */
    public MyQuene() {
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackPush.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stackPush.empty() && stackPop.empty()){
            throw new RuntimeException("queue is empty");
        }else if(stackPop.empty()){
            //把第一个栈中的数据转到第二个栈中;
            while(!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }

        return stackPop.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("queue is empty");
        }else if(stackPop.empty()){//stackPop 必须为空才可以;
            while(!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }

        }
        return stackPop.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stackPop.empty() && stackPush.empty()){
            return true;
        }
        return false;
    }
}
