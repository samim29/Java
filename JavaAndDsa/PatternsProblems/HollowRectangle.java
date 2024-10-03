import java.util.*;

public class HollowRectangle {
    public static void hollow_rectangle(int row, int col){
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if(i==1||j==1||i==row||j==col) System.out.print("* ");
                else System.out.print("  ");
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
        hollow_rectangle(row, col);
    }
}
