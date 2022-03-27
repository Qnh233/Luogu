package homeworks;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author 必燃
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        String name;
//        Scanner sc = new Scanner(System.in);
//        name = sc.nextLine();
//        System.out.println(change(name));
        String s = "lige";
        String l=new String("lige");
        System.out.println(s.equals(l));
        s.hashCode();
        System.out.println(l);


    }


    static String change(String name) {

        String[] ss = name.split(" ");
        ss[1].toUpperCase();
        return ss[ss.length - 1] + "," + ss[0] + '.' + ss[1].charAt(0);
    }
}
