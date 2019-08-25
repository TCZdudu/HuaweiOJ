package Huawei201908;

import java.util.Scanner;

public class IntergerSplit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            int n = Integer.parseInt(s.nextLine());
            System.out.println(func(n, n));
        }
    }

    public static int func(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        } else if (n == m || n < m) {
            return 1 + func(n, n - 1);
        } else {
            return func(n - m, m) + func(n, m - 1);
        }

    }
}
