package Pattern.Alphabets;

import java.util.Scanner;

public class MixedSmallAndCapitalLeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            char ch;
            if(i%2 == 0){
                ch = (char)(64+ i);
            }
            else {
               ch = (char)(96 + i);
            }
            for(int j=1; j<=row; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }


    }
}
