package basic;

import java.util.Scanner;

public class TotalSurfaceAreaOfCuboid {
    public static void main(String[] args) {

        // totalSurfaceArea = 2(lw + wh + wl)
         int l, w, h, totalSurfaceArea;

         Scanner my = new Scanner(System.in);
        System.out.println("Enter length of cuboid");
        l = my.nextInt();
        System.out.println("Enter width of cuboid");
        w = my.nextInt();
        System.out.println("Enter height of cuboid");
        h = my.nextInt();

        totalSurfaceArea = 2*(l*w + w*h + h*l);
        System.out.println(totalSurfaceArea);
    }
}
