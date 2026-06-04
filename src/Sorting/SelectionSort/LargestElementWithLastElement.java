package Sorting.SelectionSort;

import java.util.Scanner;

public class LargestElementWithLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array element");

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++) {
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for (int j=0; j<n-i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxdx = j;
                }
            }
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[maxdx];
            arr[maxdx] = temp;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
