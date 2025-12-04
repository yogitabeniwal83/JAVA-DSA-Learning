package If_Else;

import java.util.Scanner;

public class GreatestOfThreeNumberByNestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        System.out.println("Enter third number");
        int z = sc.nextInt();

        if(x >= y){
            if(x >= z) {
                System.out.println("x is Greatest");
            }
            else{
                System.out.println("z is greatest");
            }
        }
        else {
            if(y >= z) {
                System.out.println("y is greatest");
            }
            else {
                System.out.println("z is greatest");
            }
        }
    }
}
