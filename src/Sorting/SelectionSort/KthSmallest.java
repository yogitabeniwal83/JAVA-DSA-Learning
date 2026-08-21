package Sorting.SelectionSort;

import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array element");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // time complexity = O(n*k)
        int k = 3;
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j<n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        System.out.println(arr[k-1]);
    }
}
