package jason.com.leetcode;

/**
 * @program:MyIdeaTest
 * @description:盛水最多的容器
 * @author:JasonYu
 * @date:2019-09-05 14-13
 **/
public class leetcode11 {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] arr)
    {
        int result = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int value = Math.min(arr[i],arr[j]);
                if(value*(j-i)>result)
                    result = value*(j-i);
            }
        }
        return result;
    }
}
