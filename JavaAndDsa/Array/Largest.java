package GitHub.Java.JavaAndDsa.Array;
import java.util.*;
public class Largest {
    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE; //it denotes the - infinity
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) max=arr[i];
        }
        return max;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element of the array: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The largest value in the array is : "+largest(arr));
       
    }
}
