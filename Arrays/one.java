package Arrays;
// Problem Statement: Given an array, we have to find the largest element in the array.
/**
 * one
 */
public class one {

    public static void main(String args[]){
        int[] arr = {3,6,7,8,23,1};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The largest element is : "+max);
    }
}