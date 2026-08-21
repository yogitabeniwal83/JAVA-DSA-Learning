package Pattern.Specialpattern;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int nsp=n-1;
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++) {
                System.out.print("  ");
            }
                for(int j=1; j<=num; j++){
                    System.out.print(j+" ");
                }
                nsp--;
                num += 2;
            System.out.println();
        }
    }
}

