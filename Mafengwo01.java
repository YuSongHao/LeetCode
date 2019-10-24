

/**
 * @program:MyIdeaTest
 * @description:马蜂窝笔试题01
 * @author:JasonYu
 * @date:2019-09-23 19-16
 **/
import java.util.*;
public class Mafengwo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String allStr = sc.nextLine();
        String[] eachStr = allStr.split(" ");
//        for (int i = 0; i < eachStr.length; i++) {
//            System.out.println(eachStr[i]);
//        }
        findTop3(eachStr);
    }
    public static void findTop3(String[] str)
    {
        HashMap<String, ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
        TreeMap<String,Integer> ts = new TreeMap<String,Integer>();
        for (int i = 0; i < str.length; i++) {
            String[] eachCity = str[i].split("-");
            if(hm.containsKey(eachCity[1]))
            {
                ArrayList alNew = hm.get(eachCity[1]);
                int index = alNew.size();
                for (int j = 0; j < alNew.size(); j++) {
                    if(alNew.get(j).equals(eachCity[0])){
                        break;
                    }
                    index--;
                }
                if (index ==0) {
                    alNew.add(eachCity[0]);
                    int temp = ts.get(eachCity[1]);
                    temp = temp + 1;
                    ts.put(eachCity[1], temp);
                }
            }else
            {
                ArrayList<String> al = new ArrayList<>();
                al.add(eachCity[0]);
                hm.put(eachCity[1],al);
                ts.put(eachCity[1],1);
            }
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(ts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> t1, Map.Entry<String, Integer> t2) {
                if (t1.getValue()!=t2.getValue())
                    return t2.getValue().compareTo(t1.getValue());
                else
                    return t1.getKey().compareTo(t2.getKey());
            }
        });
        if (list.size()>=3)
        {
            for (int i = 0; i < 3; i++) {
                Map.Entry me = list.get(i);
                System.out.println(me.getKey() + " " + me.getValue());
            }
        }
        else{
            for (int i = 0; i < list.size() ; i++) {
                Map.Entry me = list.get(i);
                System.out.println(me.getKey() + " " + me.getValue());
            }
        }
    }
}
