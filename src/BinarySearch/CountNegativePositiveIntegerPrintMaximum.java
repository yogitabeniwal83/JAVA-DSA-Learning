package BinarySearch;

import java.util.Scanner;

public class CountNegativePositiveIntegerPrintMaximum {
    public static void countNegativePositive(int[] arr) {
        int n = arr.length;

        // binary search for first non - negative (>=0)
        int left = 0, right = n - 1;
        int firstNonNegative = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= 0) {
                firstNonNegative = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int negativeCount = firstNonNegative;


        // binary search for first positive (> 0)
        left = 0;
        right = n - 1;
        int firstPositive = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > 0) {
                firstPositive = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int positiveCount = n - firstPositive;

        System.out.println("Negative count: " + negativeCount);
        System.out.println("Positive count: " + positiveCount);
        System.out.println("maximum count(positive or negative): " + Math.max(negativeCount, positiveCount));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter element of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countNegativePositive(arr);

    }
}