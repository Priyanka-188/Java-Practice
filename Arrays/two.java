package Arrays;
// Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

import java.util.Scanner;
public class two{
    public static void main(String[] args){
        int arr[] = {11,3,54,7,8,2,0,1};

        int lowest = Integer.MAX_VALUE;
        int second_low = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]< lowest){
                second_low = lowest;
                lowest = arr[i];
            }
            else if(arr[i]<second_low && arr[i]!=lowest){
                second_low = arr[i];
            }
        }
        System.out.println("Lowest no. is "+lowest);
        System.out.println("Second lowest no. is "+second_low);
    }

    
}