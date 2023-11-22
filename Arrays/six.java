package Arrays;

//Left Rotate the Array by One
// Problem Statement: Given an array of N integers, left rotate the array by one place.

public class six {

    public static void shiftLeft(int arr[]){
        int temp = arr[0];
        int length = arr.length;
        for(int i=0; i<(length-1); i++){
            arr[i] = arr[i+1];
        }
        arr[length-1]= temp;

        //to print the shifted error

        for (int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    

    public static void main(String[] args){
        int arr[] = {0,1,2,3,4,5,6,7};

        shiftLeft(arr);
    }
}
