

import java.util.*;

public class DecimalToBinary {
    public static int decimalToBinary(int num){
        int binary=0;
        int pos=1;
        while (num>0){
            int r=num%2;
            binary=binary+r*pos;
            pos*=10;
            num/=2;
        }
        return binary;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the decimal number: ");
        int num=sc.nextInt();
        System.out.println("The corresponding binary number is "+decimalToBinary(num));
    }
}
