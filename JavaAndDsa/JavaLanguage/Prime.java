

import java.util.*;


public class Prime {
    public static Boolean checkPrime(int num){
        if (num<=0 || num==1) return false;
        else if (num==2) return true;
        else{
            for (int i=2;i<=Math.sqrt(num);i++){
                if (num%i==0) return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =sc.nextInt();
        if (checkPrime(num)) System.out.println("It is a prime number .");
        else System.out.println("It is not a prime number .");
    }
}

