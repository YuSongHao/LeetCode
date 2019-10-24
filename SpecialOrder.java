import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @program:MyIdeaTest
 * @description:4位数比较（先比后三位，再比第一位）
 * @author:JasonYu
 * @date:2019-10-23 09-17
 **/
public class SpecialOrder {
    public static void main(String[] args) {
        Object[] arrays = {1449,1023,2332,2342,4432,9328,2348,5484,6328};
        ArrayList<Integer> al = new ArrayList(Arrays.asList(arrays));
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer t1,Integer t2) {
                int aft1 = t1%1000;
                int aft2 = t2%1000;
                int bef1 = t1/1000;
                int bef2 = t2/1000;
                int result = 0;
                if (aft1==aft2)
                {
                    result = bef1<bef2?1:-1;
                }
                else{
                    result = aft1<aft2?1:-1;
                }
                return result;
            }
        });
        arrays = al.toArray();
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }
}
