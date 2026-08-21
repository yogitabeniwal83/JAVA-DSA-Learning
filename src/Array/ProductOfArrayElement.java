package Array;

import java.util.Scanner;

public class ProductOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element");

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int multi = 1;
        for(int i=0; i<n; i++){
           multi *= arr[i];
        }
        System.out.print(multi);
    }
}
