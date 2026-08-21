package TimeAndSpaceComplexity;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int m = sc.nextInt();

        int[] arr = new int[m];
//         m = arr.length;
        int n = arr.length;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.println("hello");
            }
        }
    }
}

// time complexity = O(m*n)
// space complexity = O(1)