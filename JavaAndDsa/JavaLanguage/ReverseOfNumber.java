package JavaAndDsa.JavaLanguage;
import java.util.*;

public class ReverseOfNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        
        while (num>0){
            int r=num%10;
            System.out.print(r);
            num/=10;
        }
        
    }
}
