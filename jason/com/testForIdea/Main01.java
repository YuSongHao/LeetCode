package jason.com.testForIdea;

import java.util.ArrayList;

public class Main01 {
    public static void main(String[] args) {
        String str = "2*x+x+x+8=16";
        int value = solve(str);
        System.out.println(value);
    }
    public static int solve(String str)
    {
        String[] strArr = str.split("=");
        if(strArr.length!=2)
            return -1;
        String left = strArr[0];
        String right = strArr[1];
        double[] arrLeft = praseX(left);
        double[] arrRight = praseX(right);
        if(arrLeft[0]-arrRight[0]==0)
            return -1;//避免除0；
        double x = (arrRight[1]-arrLeft[1])/(arrLeft[0]-arrRight[0]);
        if(x>0.0&&(x*10)==((int)x)*10)
            return (int)x;
        else
            return -1;
        //先按+号分割。再按-号分割，最后按*号分割；
    }
    public static double[] praseX(String str)
    {
        String[] strPlus = str.split("\\+");
        double coefX = 0;
        double coefNum = 0;
        double[] res = new double[2];
        for (int i = 0; i < strPlus.length; i++) {
            String[] strPlusMinus = strPlus[i].split("-");
            for (int j = 0; j < strPlusMinus.length; j++) {
                String strPlusMinusMu = strPlusMinus[j];
                if(strPlusMinusMu.contains("x")&&j>=1)
                {
                    if(strPlusMinusMu.length()==1)
                        coefX-=1;
                    else{
                    String numX = strPlusMinusMu.substring(0,strPlusMinusMu.length()-2);
                    double value = Double.parseDouble(numX);
                    coefX-=value;}
                }else if(strPlusMinusMu.contains("x")&&j<1){
                    if(strPlusMinusMu.length()==1)
                        coefX+=1;
                    else{
                    String numX = strPlusMinusMu.substring(0,strPlusMinusMu.length()-2);
                    double value = Double.parseDouble(numX);
                    coefX+=value;}
                }else if(!strPlusMinusMu.contains("x")&&j>=1)
                {
                    double value = Double.parseDouble(strPlusMinusMu);
                    coefNum-=value;
                }else if(!strPlusMinusMu.contains("x")&&j<1){
                    double value = Double.parseDouble(strPlusMinusMu);
                    coefNum+=value;
                }
            }

        }
        res[0] = coefX; res[1] = coefNum;
        return res;
    }
}
