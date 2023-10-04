import java.util.Scanner;
//Write a Java  method to find the maximum element in an array.

class maxValueInArray{
    public static int maxValue(int arr[] , int n){
        int max = arr[0];
        for(int i=1; i<n ;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for(int i=0 ; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The max element of array is: "+maxValue(arr, n));

    }
}