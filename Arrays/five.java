package Arrays;
// Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
import java.util.Scanner;

public class five{
    public static boolean isSorted(int[] arr){
        for(int i=0; i<arr.length-1 ; i++){
            int j = i+1;
            if(arr[j] < arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n +" elements of array");
        for(int i=0; i<n; i++){
            System.out.print("Enter "+i+"th element of array: ");
            arr[i] = sc.nextInt();
        }

        boolean result = isSorted(arr);
        if(result) System.out.println("Array is sorted.");
        else System.out.println("Array is not sorted.");
    }
}
