package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistInJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(10);
        arr.add(11);

        System.out.println(arr.get(2));   // arr[2]
        arr.set(3,50);  // arr[3] = 50

        System.out.print(arr);  // not traversing the element the array by ourselves
        System.out.println();

        int n = arr.size();  // arr.length
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();
        for(int ele : arr){
            System.out.print(ele+" ");
        }

        System.out.println();
        // 25 21 18 50 11
        arr.add(78);  // 25 21 18 50 11 78
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);


        int i=0, j=arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
//        Collections.reverse(arr);
//        System.out.println(arr);

        ArrayList<Character> arr2 = new ArrayList<>();


    }
}