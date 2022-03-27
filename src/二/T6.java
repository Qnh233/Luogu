package 二;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class T6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=true;
        int sum=0;int num=0;
        int[]q=new int[]{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        for (int i = 0; i < n; i++) {
            String id=sc.next();
            char[]cs=id.toCharArray();
            for (int j = 0; j < cs.length-1; j++) {
                if(!(cs[j]-'0'>=0&&cs[j]-'0'<=9))
                {
                    System.out.println(id);
                    num++;b=false;
                    break;
                }
                int t=cs[j]-'0';
                sum+=t*q[j];
            }
            if(b)
            {
               char[]k=new char[] {'1','0','X','9','8','7','6','5','4','3','2'};
               if(!(k[sum%11]==cs[cs.length-1]))
               {
                   System.out.println(id);num++;
               }
            }
            sum=0;
            b=true;
        }
        if(num==0)
        {
            System.out.println("All passed");
        }

    }
}
