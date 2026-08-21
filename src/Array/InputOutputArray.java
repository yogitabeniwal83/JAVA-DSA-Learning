package Array;

import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int [] arr = {5,30,-2,35,87,20};
        int n = arr.length;  // index -> 0 to n-1
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

//            using while loop
//            int i=0;
//            while(i<=5){
//                System.out.println(arr[i]+" ");
//                i++;
//            }


    }
}

