package Pattern.Star;

import java.util.Scanner;

public class PrintSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row value");
        int n = sc.nextInt();
//        System.out.println("Enter column value");
//        int col = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
