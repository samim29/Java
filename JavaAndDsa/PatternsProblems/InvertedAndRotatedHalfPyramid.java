package GitHub.Java.JavaAndDsa.PatternsProblems;
import java.util.*;
public class InvertedAndRotatedHalfPyramid {
    public static void invertedRotatedHalfPyramid(int row, int col){
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col-i;j++){
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
        System.out.println("Enter the number of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col=sc.nextInt();
        invertedRotatedHalfPyramid(row, col);
    }
}


    

