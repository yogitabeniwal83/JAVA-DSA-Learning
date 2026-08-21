package Pattern.Specialpattern;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row value");
        int row = sc.nextInt();
        System.out.println("Enter row value");
        int col = sc.nextInt();

        int rowMid = row/2+1;
        int colMid = col/2+1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i == rowMid || j == colMid ){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
