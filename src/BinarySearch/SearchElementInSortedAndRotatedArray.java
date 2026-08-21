package BinarySearch;

import java.util.Scanner;

public class SearchElementInSortedAndRotatedArray {
    public static void searchElementInSortedRotatedArray(int[] arr, int target){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == target){
                System.out.println("find element at index: " + mid);
                return;
            }
            else if(arr[left] <= arr[mid]){  // left half is sorted
                if(arr[left] <= target && target < arr[mid]) right = mid-1;
                else left = mid+1;
            }
            else { // mid to high is sorted
                if(arr[mid] < target && target <= arr[right]) left = mid+1;
                else right = mid-1;
            }
        }
        System.out.println("Element not found");
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
        System.out.println("Enter target element");
        int target = sc.nextInt();

        searchElementInSortedRotatedArray(arr, target);
    }
}
