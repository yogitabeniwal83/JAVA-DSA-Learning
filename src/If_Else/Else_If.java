package If_Else;

import java.util.Scanner;

public class Else_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int y = sc.nextInt();
        if(y%5 == 0 && y%3 == 0) {
            System.out.println("Divisible by 5 or 3 both");
        }
        else if(y%3 == 0) {
            System.out.println("Divisible by 3");
        }
        else if(y%5 == 0) {
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not Divisible by 5 or 3");
        }
    }
}
