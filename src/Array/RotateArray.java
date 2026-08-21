package Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = 3;
        d = d % n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public static void reverse(int[] arr, int i, int j){
        while(i<j){
           int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Rotated Array");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
