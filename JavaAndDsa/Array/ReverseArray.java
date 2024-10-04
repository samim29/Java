import java.util.Scanner;

public class ReverseArray {
    
    public static void reverseArray(int arr[]){
        int startIndex=0;
        int lastIndex=arr.length-1;
        while(startIndex<lastIndex){
            int temp=arr[lastIndex];
            arr[lastIndex]=arr[startIndex];
            arr[startIndex]=temp;
            startIndex++;
            lastIndex--;
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
        reverseArray(arr);
        System.out.println("The reversed array is:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}
}