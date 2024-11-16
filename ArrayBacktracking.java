import java.util.*;

public class ArrayBacktracking{
    public static void changearr(int arr[], int index, int add, int sub){
        if(index == arr.length){
            printarr(arr);
            return;
        }
        arr[index] = add;
        changearr(arr, index+1, add+1, sub);
        arr[index] = arr[index] - sub; 
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter value to add: ");
        int add = sc.nextInt();
        System.out.print("Enter value to sub: ");
        int sub = sc.nextInt();
        changearr(arr, 0, add, sub);
        printarr(arr);
    }
}