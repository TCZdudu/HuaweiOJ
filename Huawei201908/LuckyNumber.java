package Huawei201908;

import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            int sum = 0;
            int n = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            int i;

            for (i = 1; i <= n; i++) {
                if (i % x == 0) {
                    sum += 1;
                    continue;
                }
                if (i % y == 0) {
                    sum += 1;
                    continue;
                }
                if (i % z == 0) {
                    sum += 1;
                    continue;
                }
            }
            System.out.println(sum);
        }
    }
}
