package Array;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element");
        int target = sc.nextInt();
        boolean flag = false;  // false means target array me nhi h

        int[] arr = {2,5,7,4,9,10,6,9};

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Target exists in Array"+ i);
                flag = true;  // true means target array me h
                break;
            }
        }
        if(flag == true) System.out.println("Target missing in Array");
    }
}
