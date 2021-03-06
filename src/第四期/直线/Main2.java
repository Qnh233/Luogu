package 第四期.直线;
import java.util.Scanner;
import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改
/**
 * @auther: 必燃
 * @version： 2.0
 * java 原创答案
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        List<Integer> points = new ArrayList<>();
        Set<String> ans = new HashSet<>();
        for(int i = 0; i < 20; i ++){
            for (int j = 0; j < 21; j++) {
                points.add(i * 100 + j);
            }
        }
        int size = points.size();
        for (int i = 0; i < size; i++) {
            int node1 = points.get(i);
            int x1 = node1 / 100, y1 = node1 % 100;
            for (int j = i + 1; j < size; j++) {
                int node2 = points.get(j);
                int x2 = node2 / 100, y2 = node2 % 100;
                int up = y1 - y2, down = x1 - x2;
                if(down == 0){
                    ans.add("x = " + x1);
                    continue;
                }
                //利用最大公约数
                int c1 = gcd(up, down);
                String K = up / c1 + " " + down / c1;
                int Up = y1 * down - x1 * up;
                int c2 = gcd(Up, down);
                String B = Up/c2 + " " + down / c2;
                ans.add(K + " " + B);
            }
        }
        System.out.println(ans.size());
    }
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
