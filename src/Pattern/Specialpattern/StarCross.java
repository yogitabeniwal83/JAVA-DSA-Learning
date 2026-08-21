package Pattern.Specialpattern;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size value");
        int size = sc.nextInt();

        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
              if(j == i || j == (size-i+1)){
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
