package Sorting;

import java.util.Scanner;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n = sc.nextInt();
        System.out.println("Enter size of second array");
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        System.out.println("Enter element of first array");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element of second array");
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }

        int i=0, j=0;
        System.out.print("Union of arrays: ");
        while(i<n && j<m){
            if(a[i] < b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else if(a[i] > b[j]){
                System.out.print(b[j]+" ");
                j++;
            }
            else{
                // both are equal
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }

        // include remaining element
        while(i<n){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<m){
            System.out.print(b[j]+" ");
            j++;
        }
        System.out.println();
    }
}
