package Array;

import java.util.Scanner;

public class Segregate_0s_and_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();
        System.out.println("enter array element");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        int i=0, j=n-1;
        while(i < j) {
            while (i < j && arr[i] == 0) i++;
            while (i < j && arr[j] == 1) j--;
            if (i < j) {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
     for(int ele : arr){
         System.out.print(ele+" ");
     }
    }
}
