package If_Else;

import java.util.Scanner;

public class TernaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();

//        int y;
//        if(x >= 0) y = 100;
//        else y = 0;
//        System.out.println(y);

        int y = (x >= 0) ? 100 : 0;
        System.out.println(y);
    }
}
