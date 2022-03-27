package 二;

import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class T4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ns=new int[n+1];
        int[] bs=new int[n+1];
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            int number=1;

//            if(x<0)
//            {
//                for(int j=0;j<bs.length;j++)
//                {
//                    if(bs[j]==x)
//                    {
//                        number++;
//                    }
//                }
//                ns[number]=x;
//            }
//            else
//            {
                for(int j=0;j<i+1;j++)
                {
                    if(bs[j]==x)
                    {
                        number++;
                    }
                }
                    ns[number]=x;
                    bs[i]=x;

        }
        int max=0;
        for (int i = 0; i < ns.length; i++) {
            if(ns[i]!=0)
            {
                max=i;
            }
        }
        System.out.println(ns[max]+" "+max);

    }
}
