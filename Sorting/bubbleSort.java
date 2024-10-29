import java.util.*;

public class bubbleSort {
    public static void sort(int arr[]){

        for (int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
               
            }
            if(flag==0){
                break;
            }
        }
}
public static void main(String args[]){

    System.out.println("Enter the size of the array:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    sort(arr);

    for (int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }


}
}