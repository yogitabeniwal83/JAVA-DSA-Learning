package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0, j = n - 1;
        while (i < j) {
            while (i < j && arr[i] == 0) i++;
            while (i < j && arr[j] == 1) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}

