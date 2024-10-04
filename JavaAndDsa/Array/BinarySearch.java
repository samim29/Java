import java.util.Scanner;

public class BinarySearch{
    public static int binarySearch(int arr[],int  key){

        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if (arr[mid]==key) return mid;
            else if (arr[mid]>key){
                high=mid-1;
            }
            else low=mid+1;
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
        int idx=binarySearch(arr, key);
        if (idx==-1) System.out.println("Element is not present in the array");
        else System.out.println("The element is present in the index no "+idx);
    }
}