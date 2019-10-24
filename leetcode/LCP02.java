package leetcode;

/**
 * @program:MyIdeaTest
 * @description:LCP02
 * @author:JasonYu
 * @date:2019-09-26 15-37
 **/
public class LCP02 {
    public static void main(String[] args) {
        int[] nums = {2147483647};
        int[] result =fraction(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] fraction(int[] cont)
    {
        if (cont.length<2)
            return cont;
        int len = cont.length-1;
        int[] res = new int[2];
        while(len>=0)
        {
            if(len==cont.length-1)
            {
                res = divdieEach(cont[len-1],1,1,cont[len]);
                len-=2;
            } else{
                res = divdieEach(cont[len],1,res[0],res[1]);
                len-=1;
            }
        }
        int[] result = new int[2];
        result[0] = res[1];
        result[1] = res[0];
        int maxCon = findMaxCon(result);
        result[0] = result[0]/maxCon;
        result[1] = result[1]/maxCon;
        return result;
    }
    public static int[] divdieEach(int aNum,int aDom,int bNum,int bDom)
    {
        int[] res = new int[2];
        if (aNum!=0) {
            res[0] = aDom * bDom;
            res[1] = aNum * bDom + aDom * bNum;
        }else
        {
            res[0]=bDom;
            res[1]=bNum;
        }
        return res;
    }
    public static int findMaxCon(int[] result)
    {
        int min = result[0]<result[1]?result[0]:result[1];
        int res = 1;
        for (int i = min; i >=1 ; i--) {
            if(result[0]%i==0&&result[1]%i==0)
                res = i;
        }
        return res;
    }
}
