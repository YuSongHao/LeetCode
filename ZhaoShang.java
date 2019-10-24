import java.util.Stack;

/**
 * @program:MyIdeaTest
 * @description:招商02
 * @author:JasonYu
 * @date:2019-09-24 16-41
 **/
public class ZhaoShang {
    public static int calculate(int first,int second,String operator)
    {
        int result =0;
        switch (operator)
        {
            case "+":
                result = first+second;
                break;
            case "-":
                result = first-second;
                break;
            case "*":
                result = first*second;
                break;
            case "/":
                result = first/second;
        }
        return result;
    }
    public static int function(Stack<String> stack){
        Stack<Integer> result = new Stack<>();
        while(!stack.isEmpty()){
            String element = stack.pop();
            try{
                result.push(Integer.parseInt(element));
            }catch (Exception e)
            {
                int b = result.pop();
                int a = result.pop();
                result.push(calculate(a,b,element));
            }
        }
        return result.peek();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("*");
        stack.push("3");
        stack.push("+");
        stack.push("1");
        stack.push("2");
        System.out.println(function(stack));
    }
}
