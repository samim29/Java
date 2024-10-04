import java.util.*;
public class LinearSearch{
    public static int linearSearch(int arr[],int  key){

        for (int i=0;i<arr.length;i++){
            if (arr[i]==key) return i;
        }
        return -1;

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
        System.out.println("Enter the element to be searched: ");
        int key=sc.nextInt();
        int idx=linearSearch(arr, key);
        if (idx==-1) System.out.println("Element is not present in the array");
        else System.out.println("The element is present in the index no "+idx);
    }
}