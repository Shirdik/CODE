package Java;

import java.util.Scanner;

public class IterativePower {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int res;
        res = 1;
        while (y > 0) {
            if (y % 2 != 0)
                res *= x;
            y /= 2;
            x *= x;
        }
        System.out.println(res);
        in.close();
    }
}
