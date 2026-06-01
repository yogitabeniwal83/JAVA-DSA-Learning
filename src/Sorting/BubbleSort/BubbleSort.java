package Sorting.BubbleSort;

import java.util.Scanner;
//
//import static Array.SortArrayBuiltIn.print;

public class BubbleSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array element");

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        print(arr);
//        for(int i=0; i<n-1; i++) {
//            for (int j=0; j<n-1-i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

        // bubble sort optimization
        for(int i=0; i<n-1; i++){
            int swaps = 0;
             for(int j=0; j<n-1-i; j++){
                 if(arr[j] > arr[j+1]){
                     int temp = arr[j];
                     arr[j]= arr[j+1];
                     arr[j+1] = temp;
                     swaps++;
                 }
             }
             if(swaps == 0) break;
        }
        print(arr);

    }

}

