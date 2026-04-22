package Pattern.Star;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row value");
        int row = sc.nextInt();
        System.out.println("Enter column value");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
