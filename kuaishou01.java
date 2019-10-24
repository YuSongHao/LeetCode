/**
 * @program:MyIdeaTest
 * @description:快手笔试题01
 * @author:JasonYu
 * @date:2019-09-16 21-52
 **/
import java.util.Scanner;
public class kuaishou01 {
    private static final String IPv4 = "IPv4";
    private static final String IPv6 = "Ipv6";
    private static final String NEITHER= "Neither";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc. nextLine();
        System.out.println(validIPAddress(str));
    }
    public static String validIPAddress(String IP)
    {
        if(IP==null||IP.isEmpty())
            return NEITHER;
        if (IP.contains(".")) {
            if (IP.endsWith(".")) {
                return NEITHER;
            }
            String[] ipCols = IP.split("\\.");
            if (ipCols.length != 4)
                return NEITHER;
            for (String c : ipCols) {
                if (!isIpv4valid(c)) {
                    return NEITHER;
                }
            }

            return IPv4;
        }else if(IP.contains(":")){
            if(IP.endsWith(":"))
                return NEITHER;
            String[] ipCols = IP.split(":");
            if(ipCols.length!=8)
                return NEITHER;
            for (String c:ipCols) {
                if(!isIPv6valid(c))
                    return NEITHER;
            }
            return IPv6;
        }else
        {
            return NEITHER;
        }
    }
    private static boolean isIpv4valid(String s)
    {
        if(s.length()>3||s.isEmpty())
            return false;
        if(s.charAt(0)=='-')
            return false;
        if(s.charAt(0)=='0')
            return s.equals("0");
        int digit = 0;
        try {
            digit=Integer.valueOf(s);
        }catch(NumberFormatException e){
           return false;
        }
        return digit>=0&&digit<=255;
    }
    private static boolean isIPv6valid(String s)
    {
        String IPv6char = "0123456789abcdefABCDEF";
        if (s.equals("")||s.length()>4)
        {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (IPv6char.indexOf(s.charAt(i))==-1)
                return false;
        }
        return true;
    }
}
