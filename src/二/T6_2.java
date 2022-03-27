package 二;

/**
 * @auther: 必燃
 * @version： 1.0
 */

import java.util.Scanner;

public class T6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nn = new int[]{7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        int[] z = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] m = new char[]{'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        int sum = 0;
        char biaoji = 10;
        int biaoji2 = 0;
        String ss = in.next();
        for (int i = 0; i < n; i++) {
            in.nextLine();
            String s = in.nextLine();
            char[] a = s.toCharArray();
            for (int j = 0; j <= s.length() - 2; j++) {
                sum = sum + (a[j] - 48) * nn[j];
            }
            sum = sum % 11;
            for (int j = 0; j < 11; i++) {
                if (sum == z[j]) {
                    biaoji = m[j];
                    break;
                }
            }
            if (biaoji == s.charAt(17)) {
                System.out.println(s);
            }
        }
    }
}