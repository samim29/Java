package GitHub.Java.JavaAndDsa.PatternsProblems;
import java.util.Scanner;
public class ButterFly {
    public static void butterFly(int n){
        //1st part
        for (int i=1;i<=n;i++){ //outer loop
            //1st star
            for (int j=1;j<=i;j++){
               System.out.print("*");
            }
            //space
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
             }
            //star
             for (int k=1;k<=i;k++){
                   System.out.print("*");
                }

            System.out.print("\n");
        }
        //2nd part as it is the mirror image of upper part just start the outer loop from last  
        for (int i=n;i>=1;i--){ 
            for (int j=1;j<=i;j++){
               System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
             }
             
             for (int k=1;k<=i;k++){
                   System.out.print("*");
                }

            System.out.print("\n");
        }
    } 
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n=sc.nextInt();
        butterFly(n);
    }   
}


