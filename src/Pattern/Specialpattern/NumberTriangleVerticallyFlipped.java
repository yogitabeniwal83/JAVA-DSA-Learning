package Pattern.Specialpattern;

import java.util.Scanner;

public class NumberTriangleVerticallyFlipped {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number");
            int n = sc.nextInt();


            for(int i=1; i<=n; i++){
                int x=1;
                for(int j=1; j<=n-i; j++){
                    System.out.print("  ");  // spaces
                }
                for(int j=1; j<=i; j++){
                    System.out.print(x+" ");   // stars
                    x++;
                }
                System.out.println();
            }
    }
}
