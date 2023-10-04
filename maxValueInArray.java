import java.util.Scanner;
//Write a Java  method to find the maximum element in an array.

class maxValueInArray{
    //crating a function to find out maximum element in array
    public static int maxValue(int arr[] , int n){
        int max = arr[0];
        for(int i=1; i<n ;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    //main function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();   

        int[] arr = new int[n];     //creating an array of size n

        //taking array element input from user
        System.out.println("Enter elements of array: ");
        for(int i=0 ; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        //calling the function and printing the result
        System.out.println("The max element of array is: "+maxValue(arr, n));

    }
}