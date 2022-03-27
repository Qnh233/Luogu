package 二;

import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class T2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>9999)
        {
            System.out.println(String.format("%d-%02d",n/100,n%100));
        }
        else
        {
            if(n/100<22)
            {
                System.out.println(String.format("20%02d-%02d",n/100,n%100));
            }
            else
            {
                System.out.println(String.format("19%02d-%02d",n/100,n%100));
            }

        }
    }
}
