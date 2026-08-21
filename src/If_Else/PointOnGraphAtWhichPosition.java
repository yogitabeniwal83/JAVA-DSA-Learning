package If_Else;

import java.util.Scanner;

public class PointOnGraphAtWhichPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first co-ordinate");
        int x = sc.nextInt();
        System.out.println("Enter second co-ordinate");
        int y = sc.nextInt();

        if(x == 0 && y == 0) {
            System.out.println("At origin");
        }
        else if(x == 0 && y > 0) {
            System.out.println("At y-axis");
        }
        else if(x > 0 && y == 0) {
            System.out.println("At x-axis");
        }
        else if(x > 0 && y > 0) {
            System.out.println("At first co-ordinate");
        }
        else if(x < 0 && y > 0) {
            System.out.println("At second co-ordinate");
        }
        else if(x < 0 && y < 0) {
            System.out.println("At third co-ordinate");
        }
        else {
            System.out.println("At fourth co-ordinate");
        }
    }
}
