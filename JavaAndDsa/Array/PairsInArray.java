
import java.util.Scanner;


public class PairsInArray {
    public static void pairsInArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
        
    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element of the array:");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        pairsInArray(arr);
        
}
}
