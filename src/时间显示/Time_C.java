package 时间显示;

import java.text.Format;
import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class Time_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HH=0;
        long SS = 0;
        SS = sc.nextLong();
        SS/=1000;//毫秒换成秒
        HH = (int) ((SS / 3600) % 24);
        int MM = (int) ((SS % 3600) / 60);
        SS=(SS%3600)%60;
        System.out.println(String.format("%02d,%02d,%02d",HH,MM,SS));
    }

}


