package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n = sc.nextInt();
        System.out.println("Enter size of second array");
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter first array element");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter second array element");
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);  // nlogn
        System.out.println("Sorted first array: " + Arrays.toString(arr1));
        Arrays.sort(arr2);  // mlogn
        System.out.println("Sorted second array: " + Arrays.toString(arr2));

        int i=0, j=0;
        System.out.println("Commom Elements: ");
        while(i<arr1.length && j<arr2.length){  // n+m
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] +" ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else {
                j++;
            }
        }


    }
}
