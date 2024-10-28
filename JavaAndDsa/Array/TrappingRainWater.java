// import java.util.*;
// public class TrappingRainWater{
//     public static int trappedRainWater(int height[]){ //time complexity=O(n)
//         int n=height.length;
//         //calculate left max boundary-array
//         int leftmax[]=new int[n];
//         leftmax[0]=height[0];
//         for (int i=1;i<n;i++){
//             leftmax[i]=Math.max(leftmax[i-1],height[i]);
//         }
//         //calculate right max boudary -array
//         int rightmax[]=new int[n];
//         rightmax[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightmax[i]=Math.max(rightmax[i+1], height[i]);
//         }

//         int trappedWater=0;
//         //loop
//         for (int i=0;i<n;i++){
//             //waterlevel=min(leftmax bound, rightmax bound)
//             int waterlevel=Math.min(leftmax[i],rightmax[i]);
//             //trapped water=waterlevel-height[i]
//             trappedWater+=(waterlevel-height[i])*1;
//         }
//         return trappedWater;
        
        

//     }
//     public static void main(String args[]){
//         // int height[]={4,2,0,6,3,2,5};
//         int height[]={1,2,3,4,5};
//         System.out.println("The total traped water:"+trappedRainWater(height));
//     }
// }

import java.util.* ;/**
 * TrappingRainWater
 */
public class TrappingRainWater {

    public static int trappedRainWater(int height[]){
        int n=height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=height[0];
        rightmax[0]=height[n-1];
        for (int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        int totalTrappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftmax[i],rightmax[i]);
            totalTrappedWater+=(waterLevel-height[i])-1;
        }
        
        return totalTrappedWater;

    }

    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println("Total trapped water is "+trappedRainWater(height));

    }
    
}

