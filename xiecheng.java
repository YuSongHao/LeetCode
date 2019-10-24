

/**
 * @program:MyIdeaTest
 * @description:携程笔试题01
 * @author:JasonYu
 * @date:2019-09-04 19-32
 **/
import java.util.Scanner;
public class xiecheng{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double[] trainLabel = new double[length];
        double[] predictLabel = new double[length];
        for (int i = 0; i < length; i++) {
            trainLabel[i] = sc.nextDouble();
            predictLabel[i] = sc.nextDouble();
        }
        //double[] trainLabel = {1,0,1,1,0,1,0,0,1,0};
        //double[] predictLabel = {0.9,0.7,0.6,0.55,0.52,0.4,0.38,0.35,0.31,0.1};
        System.out.println(roc_auc(trainLabel,predictLabel));
    }
    public static double roc_auc(double[] trainLabel,double[] predictLabel)
    {
        bubbleSort2Arr(predictLabel,trainLabel);
        int temp = 0;
        int posNumber = 0;
        for (int i = 0; i < trainLabel.length; i++) {
            if(trainLabel[i]==1.0)
            {
                posNumber++;
                temp+=i+1;
            }
        }
        double num = temp-(posNumber*(posNumber+1))/2;
        double dom = posNumber*(trainLabel.length-posNumber);
        double result = (double)num/dom;
        return result;
    }

    public static void bubbleSort2Arr(double[] arr1, double[] arr2)
    {
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = 0; j < arr1.length-1-i; j++) {
                if(arr1[j]>arr1[j+1])
                {
                    swap(arr1,j,j+1);
                    swap(arr2,j,j+1);
                }
            }
        }
    }
    public static void swap(double[] arr,int num1,int num2)
    {
        double temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

}
