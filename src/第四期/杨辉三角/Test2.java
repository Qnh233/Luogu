package 第四期.杨辉三角;

import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class Test2 {

    static int n;

    static int C(int a, int b) {
        int res = 1;
        for (int i = a, j = 1; j <= b; i--, j++) {
            res = res * i / j;
            if (res > n) {
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int k = 16; k >= 0; k--) {
            int l = 2 * k, r = Math.max(n, l), res = -1;
            while (l <= r) {
                int mid = l + r >> 1;
                if (C(mid, k) >= n) {
                    res = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (C(res, k) == n) {
                System.out.println((res + 1) * res / 2 + k + 1);

                break;
            }

        }
    }
}


