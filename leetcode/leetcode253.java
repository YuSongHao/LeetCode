package leetcode;

/**
 * @program:MyIdeaTest
 * @description:贪心算法
 * 给定一个会议时间安排的数组，每个会议时间都会包括开始和结束的时间 [[s1,e1],[s2,e2],...] (si < ei)，为避免会议冲突，同时要考虑充分利用会议室资源，请你计算至少需要多少间会议室，才能满足这些会议安排。
 *
 * 示例 1:
 *
 * 输入: [[0, 30],[5, 10],[15, 20]]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [[7,10],[2,4]]
 * 输出: 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/meeting-rooms-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author:JasonYu
 * @date:2019-09-18 19-40
 **/
public class leetcode253 {
    public static void main(String[] args) {
//        int[][] arr = {{0,30},{5,10},{15,20}};
        int[][] arr = {{7,10},{2,4}};
        System.out.println(minValueOfRoom(arr));

    }
    public static int minValueOfRoom(int[][] arr)
    {
        int max = 0;
        int minValue = 0;
        //找到范围
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max)
                    max=arr[i][j];
            }
        }
        int[] time = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            int[] temp = arr[i];
            int start = temp[0];
            int end = temp[1];
            for (int j = start; j < end; j++) {
                time[j] +=1;
            }
        }
        for (int i = 0; i < time.length; i++) {
            if (minValue<time[i])
                minValue=time[i];
        }
        return minValue;
    }
}
