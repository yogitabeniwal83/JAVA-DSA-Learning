package Array;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter array element");
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

      for(int i=0; i<arr.length; i+=2){
          if(i == arr.length-1) break;
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
      }
      for(int ele : arr){
          System.out.print(ele+" ");
      }
    }
}
