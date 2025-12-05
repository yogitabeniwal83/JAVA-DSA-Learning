package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        // absoluteValue = change negative value into positive
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();

        if(n >= 0) {
            System.out.println(n);
        }
        else {
                System.out.println(-n);
            }

    }
}
