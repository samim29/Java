import java.util.Scanner;

public class MaxSubArray {
    
        public static void printSubArray(int arr[]){

            int max=Integer.MIN_VALUE;
            int curentSum=0;
            for(int i=0;i<arr.length;i++){
                
                
                for(int j=i;j<arr.length;j++){
                    curentSum=0;
                   for(int k=i;k<=j ;k++){
                    curentSum+=arr[k];
                   }
                   System.out.print(curentSum+" ");
                    
                }
                System.out.println();
                if(curentSum>max) max=curentSum;
            }
            System.out.println("Max sum is :"+max);
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
