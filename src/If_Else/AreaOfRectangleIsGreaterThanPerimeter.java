package If_Else;

import java.util.Scanner;

public class AreaOfRectangleIsGreaterThanPerimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        System.out.println("Enter the breadth");
        int b = sc.nextInt();

        if(l*b > 2*(l+b)) {
            System.out.println("Area is greater than its perimeter");
        }
        else {
            System.out.println("Area is not greater than its perimeter ");
        }
    }
}
