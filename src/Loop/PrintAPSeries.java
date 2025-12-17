package Loop;

import java.util.Scanner;

public class PrintAPSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int a=2, d=3;
        for(int i=1; i<=n; i++){
            System.out.println(a+" ");
            a+=d;


//        for(int i=2; i<=3*n-1; i+=3){
//            System.out.println(i);
        }
    }
}
