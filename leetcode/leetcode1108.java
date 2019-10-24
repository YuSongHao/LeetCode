package leetcode;

/**
 * @program:MyIdeaTest
 * @description:ip地址无效化
 * @author:JasonYu
 * @date:2019-10-23 20-32
 **/
public class leetcode1108 {
    public static void main(String[] args) {
        String s = "10.3.8.211";
        System.out.println(defangIPaddr(s));
    }
    public static String defangIPaddr(String address)
    {
        String[] str = address.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length-1; i++) {
            sb.append(str[i]);
            sb.append("[.]");
        }
        sb.append(str[str.length-1]);
        String st = sb.toString();
        return st;
    }
}
