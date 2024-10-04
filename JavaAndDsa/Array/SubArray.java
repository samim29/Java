
import java.util.Scanner;
public class SubArray {
    public static void printSubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            
            
            for(int j=i;j<arr.length;j++){
               
               for(int k=i;k<=j ;k++){
                System.out.print(arr[k]+" ");
               }
                
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
        printSubArray(arr);
    }
}



    


