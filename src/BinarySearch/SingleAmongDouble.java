package BinarySearch;

import java.util.Scanner;

public class SingleAmongDouble {
    public static void singleAmongDouble(int[] arr){
    int n = arr.length;
    if(n == 1) System.out.println(arr[0]);
    if(arr[0] != arr[1]) System.out.println(arr[0]);
    if(arr[n-1] != arr[n-2]) System.out.println(arr[n-1]);

    int left = 0, right = n-1;
    while(left<=right){
        int mid = left + (right-left)/2;
        if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1])
            System.out.println(arr[mid]);
        int f = mid, s = mid;
        if(arr[mid-1] == arr[mid]) f = mid-1;
        else s = mid+1;

        int leftCount = f - left;
        int rightCount = right - s;
        if(leftCount%2 == 0) left = s+1;
        else right = f-1;
    }
        System.out.println("single among double element not present");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter element of array");
        for(int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }

        singleAmongDouble(arr);
    }
}
