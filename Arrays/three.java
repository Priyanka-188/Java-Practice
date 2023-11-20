package Arrays;
// Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

public class three {
    public static void main(String[] args){
        int arr[] = {11,3,54,7,8,2,0,1};

        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length ; i++){
            if(arr[i]> largest){
                sec_largest = largest;
                largest = arr[i];
            }
            else if(arr[i]>sec_largest && arr[i]!=largest){
                sec_largest = arr[i];
            }
        }
        System.out.println("Largest number: "+largest);
        System.out.println("Second Largest: "+sec_largest);
    }
}
