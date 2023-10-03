import java.util.Scanner;
//This is a Java Program to Count the Number of Occurrence of an Element in an Array.

class countOccuranceInArray{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of array: ");
     //taking the size of the array
     int n = sc.nextInt();

     //defining an array of size n of integer type

     int arr[] = new int[n];

     //taking user inputed elements
     System.out.println("Enter all the element of the array : ");
     for(int i=0; i<n ;i++){
        arr[i] = sc.nextInt();
     }

     //taking input of the elemnt whose occuranc user wanted to count
     System.out.print("Enter the element whose occurance you wanted to count in the array: ");
     int elem = sc.nextInt();

     //counting the occurance
     int count = 0;
     for(int i=0; i<n ;i++){
        if (arr[i]== elem){
            count +=1;
        }
     }
    
     System.out.println("The occurance of "+elem +" in the array is: "+count);


    }
}