package 明码;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 */
class AA {

}
class BB extends AA
{

}
public class T2 {
    public static void main(String[] args) {

        List<AA> list= new ArrayList<>();
        list.add( new BB());
//        Scanner sc=new Scanner(System.in);
//        for (int j = 0; j < 10; j++) {
//            for (int i = 0; i < 32; i++) {
//                int a = sc.nextInt();
//                String ss;
//                String str=Integer.toBinaryString(a);
//                if(a<0)
//                {
//                    ss=String.format("%08d",Integer.valueOf(str.substring(str.length()-8,str.length())));
//                }
//                else
//                {
//                    ss=String.format("%08d",Integer.valueOf(str));
//                }
//                if(i%2==0)
//                {
//                    System.out.printf(ss);
//                }
//                else
//                {
//                    System.out.println(ss);
//                }
//            }
//        }


    }
}
