/**
 * @program:MyIdeaTest
 * @description:阿里巴巴笔试第二题
 * 小明和朋友们在学校里玩最幸福男生和最大团体的游戏，首先男生女生随机站成一圈，请你帮忙选出身边女生最多的男生为最幸福男生，以及按序号连续选择一批同学，最多可以选择k个女生，选出男生最多的团体并输出最多有多少个男生。
 *
 * 输入：
 * bgbbbggbg(站成一圈的同学，首尾相接，b代表男生g代表女生)
 * k(最大团队最多可选女生数量)
 * 输出：
 * 最幸福男生所在位置(序号从0开始，如果存在多个，取按序号排第一个)，最大男生团队男生人数
 * 输入范例:
 * bgbbbgbggbgbg
 * 3
 * 输出范例:
 * 6 6
 * @author:JasonYu
 * @date:2019-08-30 18-56
 **/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ali02 {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String getIndexAndLongest(String users,int num) {
        String res = "";
        char[] ch = users.toCharArray();
        int luckMan = -1;
        int max_girl = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='b')
            {
                int max_girl_temp = 0;
                int l = i,k=i;
                while(l>0)
                {
                    if(ch[--l]=='g')
                    {
                        max_girl_temp++;
                    }
                    else
                        break;
                }
                while(k<ch.length-1)
                {
                    if(ch[++k]=='g')
                    {
                        max_girl_temp++;
                    }
                    else
                        break;
                }
                if(max_girl_temp>max_girl)
                {
                    luckMan = i;
                    max_girl = max_girl_temp;
                }
            }
            else
                continue;
        }
        if(luckMan == -1)
        {
            res +=-1+" "+num;
            return res;
        }
        res+=luckMan;
        String s = users+users;
        char[] cha = s.toCharArray();
        int max_value = 0;int girl_times = 0;
        for (int i = 0; i < cha.length-1; i++) {
            int value = 0;
            for (int j = i; j < cha.length-1; j++) {
                if (cha[j] == 'g')
                {
                    value++;
                    girl_times++;
                }
                else
                    value++;
                if(girl_times > num)
                {
                    max_value = Math.max(value,max_value);
                    break;
                }
            }
        }
        res = res+" "+(max_value-num);
        return res;
    }

    public static void main(String[] args){
        String s = "bgbbbgbggbgbg";
        int maxGirls = 3;
        String res = "";
        res = getIndexAndLongest(s,maxGirls);
        System.out.println(res);
    }
}
