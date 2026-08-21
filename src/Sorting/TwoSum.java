package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter array element");

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int target = 10;

        int i=0, j=n-1;
        boolean found = false;
        while(i<j){
            int sum = arr[i]+arr[j];

            if(sum == target){
                System.out.println("Pair Found: " + arr[i] + ", "+ arr[j]);
               found = true;
                break;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }

        if(!found){
            System.out.println("No Pair found");
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
