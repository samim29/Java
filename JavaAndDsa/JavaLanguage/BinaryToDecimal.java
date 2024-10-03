import java.util.*;


public class BinaryToDecimal {
    public static  int binarytodecimal(int binry){
        int dec=0;
        int pow=0;
        while(binry>0){
          int lastDigit=binry%10;
          dec += lastDigit*Math.pow(2, pow);
          pow++;
          binry /=10; 
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(binarytodecimal(num));
    }
}
