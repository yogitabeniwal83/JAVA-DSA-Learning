package Loop;

//import java.util.Scanner;

public class PrintAlphabetsWithASCII {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int n = sc.nextInt();

        for(int i=65; i<=90; i++){
            System.out.println((char)i + " " + i);
        }
    }
}
