

/**
 * @program:MyIdeaTest
 * @description:电信云计算笔试题02
 * @author:JasonYu
 * @date:2019-09-18 21-01
 **/
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DianXIn02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        if (message.equals(";"))
            System.out.println("True");
        else if (message.endsWith(";")&&!message.startsWith(";")||message.startsWith(";")&&!message.endsWith(";"))
           System.out.println("False");
        else{
            String[] st = message.split(";");
            if (isIsomorphic(st[0], st[1]))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
    private static boolean isIsomorphic(String s,String t)
    {
        int len = s.length();
        if(s.length()!=t.length())
            return false;
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        Map map = new HashMap();
        for (int i = 0; i < len; i++) {
            if(map.get(sch[i])!=null)
            {
                sch[i]=(char)map.get(sch[i]);
            }else
            {
                if(map.containsValue(tch[i]))
                    return false;
                map.put(sch[i],tch[i]);
                sch[i]=tch[i];
            }
            if (sch[i]!=tch[i])
            {
                return false;
            }
        }
        return true;
    }
}
