package Array;

import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n-1];
        n = arr.length + 1;
        System.out.println("Enter array element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = n*(n+1)/2;
        int arraySum = 0;
        for(int ele : arr){
            arraySum += ele;
        }
        int missing = sum - arraySum;
        System.out.println("missing number is: "+ missing);

    }
}
