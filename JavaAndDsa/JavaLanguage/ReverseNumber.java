package JavaAndDsa.JavaLanguage;
import java.util.*;
public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int r=num%10;
            rev=rev*10+r;
            num/=10;
        }
        System.err.println(rev);
    }
}
