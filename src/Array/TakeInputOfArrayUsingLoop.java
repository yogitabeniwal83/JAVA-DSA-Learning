package Array;

import java.util.Scanner;

public class TakeInputOfArrayUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int[] Karan = new int[7];
        // default values
//            for(int i=0; i<7; i++){
//                System.out.println(Karan[i]+" ");
//            }
        // input
        for(int i=0; i<7; i++){
            Karan[i] = sc.nextInt();
        }

        // print
        for(int i=0; i<7; i++){
            System.out.print(2*Karan[i]+" ");
        }
    }
}
