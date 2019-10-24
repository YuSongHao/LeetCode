import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program:MyIdeaTest
 * @description:王博笔试题02
 * 在？处填写数字，使其能被13除后余5
 * @author:JasonYu
 * @date:2019-09-16 09-22
 **/
public class Wangbo02 {
    public static void main(String[] args) {
        String str = "????";
        System.out.println(findAllConditions(str));
        int count = 0;
        for (int i = 1; i < 9999; i++) {
            if (i%13==5)
                count++;
        }
        System.out.println(count);
    }
    public static int findAllConditions(String str)
    {
        char[] ch = str.toCharArray();
        int factor = 100000007;
        int res = 0;
        Queue<String> quene = new LinkedList<String>();
        quene.add(str);
        while(quene.peek().contains("?"))
        {
            int index = quene.peek().indexOf("?");
            StringBuilder sb = new StringBuilder(quene.peek());
            for (int i = 0; i < 10; i++) {
                String a =i+"";
                sb.replace(index,index+1,a);
                quene.add(sb.toString());
            }
            quene.poll();
        }
        while(!quene.isEmpty())
        {
            String top = quene.peek();
            int value = Integer.parseInt(top);
            if (value%13==5)
                res++;
            quene.poll();
        }
        return res%factor;
    }
}
