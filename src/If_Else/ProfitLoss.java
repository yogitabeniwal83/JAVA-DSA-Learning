package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price");
        int x = sc.nextInt();
        System.out.println("Enter the selling price");
        int y = sc.nextInt();

        if(x < y) {
            System.out.println("seller has made profit");
        }
        else if(x == y) {
            System.out.println("seller has no profit and no loss");
        }
        else {
            System.out.println("seller has incurred loss");
        }
    }
}
