package If_Else;

import java.util.Scanner;

public class SideOfTriangleOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int x = sc.nextInt();
        System.out.println("Enter second Number");
        int y = sc.nextInt();
        System.out.println("Enter third Number");
        int z = sc.nextInt();

        if(x+y>z && y+z>x && x+z>y) {
            System.out.println("Side of a triangle");
        }
        else {
            System.out.println("Not side of a triangle");
        }

    }
}
