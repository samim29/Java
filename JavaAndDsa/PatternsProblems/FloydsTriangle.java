package GitHub.Java.JavaAndDsa.PatternsProblems;
import java.util.*;
public class FloydsTriangle {
    public static void floydsTriangle(int row, int col){
        int count=1;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(count++);
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
        floydsTriangle(row, col);
    }
}
