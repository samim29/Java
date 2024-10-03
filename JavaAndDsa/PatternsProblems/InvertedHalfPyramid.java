package GitHub.Java.JavaAndDsa.PatternsProblems;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void invertedHalfPyramid(int row, int col){
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col+1-i;j++){
                System.out.print(j);
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
        invertedHalfPyramid(row, col);
    }
}
