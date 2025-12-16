package Pattern.Alphabets;

import java.util.Scanner;

public class PrintAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row value");
        int n = sc.nextInt();
//        System.out.println("Enter column value");
//        int col = sc.nextInt();


        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

    }
}
