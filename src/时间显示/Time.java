package 时间显示;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class Time {
    public static void main(String[] args) {
//
// 2: 类名必须Main, 不可修改
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();

        SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");

        //n -= 8*60*60*1000;
        System.out.println(a.format(new Date(n)));



    }
}
