/**
 * @program:MyIdeaTest
 * @description:王博笔试题01
 * RRLL机器人
 * @author:JasonYu
 * @date:2019-09-16 08-43
 **/
public class Wangbo01 {
    public static void main(String[] args) {
        String str = "RRRRRLRLRL";
        int moves = Integer.MAX_VALUE-1;
        int[] res = robotMove(str,moves);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] robotMove(String str, int moves)
    {
        System.out.println(str);
        char[] ch = str.toCharArray();
        int[] result = new int[ch.length];
        //机器人位置初始化
        for (int i = 0; i < result.length; i++) {
            result[i] = 1;
        }
        //机器人移动
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='R')
            {
                int temp = i;
                int move = moves;
                result[i] -= 1;//机器人开始移动
                while(ch[temp]=='R'&&move!=0)
                {
                    temp++;
                    move--;
                }
                //确定机器人停止条件
                if(move==0)
                {
                    result[temp]+=1;
                    continue;
                }
                if(ch[temp]=='L')
                {
                    if(move%2==1)
                        result[temp-1]+=1;
                    else
                        result[temp]+=1;
                }
            }
            else if(ch[i]=='L')
            {
                int temp = i;
                int move = moves;
                result[i] -= 1;//机器人开始移动
                while(ch[temp]=='L'&&move!=0)
                {
                    temp--;
                    move--;
                }
                //确定机器人停止条件
                if(move==0)
                {
                    result[temp]+=1;
                    continue;
                }
                if(ch[temp]=='R')
                {
                    if(move%2==1)
                        result[temp+1]+=1;
                    else
                        result[temp]+=1;
                }
            }
        }
        return result;
    }
}
