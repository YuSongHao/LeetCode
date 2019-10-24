package jason.com.testForIdea;

public class FormatString {
    public static void main(String[] args) {
        String st = "   i am a   little boy.  ";
        char[] str = st.toCharArray();
        int i=0,j=0;
        while(str[i]==' '){
            i++;
        }
        while(i<=str.length-1){
            if(str[i]==' '&&(i==str.length-1||str[i+1]==' ')){ //如果中间空格的之后还存在空格的话，或者是结尾的话。
                i++;
                continue;
            }
            str[j++]=str[i++];

        }
        for(int o=0;o<j;o++){
            System.out.print(str[o]);
        }
    }
}
