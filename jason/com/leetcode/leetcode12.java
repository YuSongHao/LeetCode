package jason.com.leetcode;

/**
 * @program:MyIdeaTest
 * @description:整数转罗马数字
 * @author:JasonYu
 * @date:2019-09-05 14-57
 **/
public class leetcode12 {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(romanNumber(num));
    }
    public static String romanNumber(int num)
    {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < 13) {
            // 特别注意：这里是等号
            while (num >= nums[index]) {
                // 注意：这里是等于号，表示尽量使用大的"面值"
                stringBuilder.append(romans[index] + " ");
                num -= nums[index];
            }
            index++;
        }
        return stringBuilder.toString();
    }

}
