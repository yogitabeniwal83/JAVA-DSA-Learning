package Sorting;

import java.util.Scanner;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array element");

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        boolean isSorted = true;
        for(int i=0; i<n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }

}
