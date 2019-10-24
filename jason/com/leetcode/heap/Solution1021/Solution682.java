package jason.com.leetcode.heap.Solution1021;

public class Solution682 {
    public static void main(String[] args) {
        String[] str = {"-60","D","-36","30","13","C","C","-33","53","79"};
        System.out.println(calPoints(str));
    }
    public static int calPoints(String[] ops) {
        int result = 0;
        int value = 0;
        int[] arr = new int[ops.length];
        for (int i = 0; i < ops.length; i++) {
            String temp = ops[i];
            if(temp.equals("C"))
            {
                for (int j = i-1; j >=0 ; j--) {
                    if(arr[j]!=0)
                    {
                        arr[j] = 0;
                        arr[i] = 0;
                        break;
                    }
                }
            }
            else if(temp.equals("D"))
            {
                for (int j = i-1; j >=0 ; j--) {
                    if(arr[j]!=0)
                    {
                        value = arr[j];
                        break;
                    }

                }
                arr[i] = 2*value;
            }
            else if (temp.equals("+"))
            {
                int[] val = new int[2];
                int times = 2;
                for (int j = i-1; j >= 0 ; j--) {
                    if(arr[j]!=0)
                    {
                        val[2-times] = arr[j];
                        times--;
                    }
                    if(times == 0)
                        break;
                }
                arr[i]= val[0]+val[1];
            }
            else
            {
                value = Integer.parseInt(temp);
                arr[i] = value;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}
